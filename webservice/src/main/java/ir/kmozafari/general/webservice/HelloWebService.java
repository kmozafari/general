package ir.kmozafari.general.webservice;

import ir.kmozafari.general.api.security.AuthorityFacade;
import ir.kmozafari.general.api.security.RoleFacade;
import ir.kmozafari.general.api.security.UserFacade;
import ir.kmozafari.general.common.dto.persistence.AuthorityDto;
import ir.kmozafari.general.common.dto.persistence.RoleDto;
import ir.kmozafari.general.common.dto.persistence.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kourosh on 8/8/16.
 */

@RestController
public class HelloWebService {


    @Autowired
    private UserFacade userFacade;

    @Autowired
    private AuthorityFacade authorityFacade;

    @Autowired
    private RoleFacade roleFacade;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {


        AuthorityDto superUser = new AuthorityDto();
        superUser.setName("superUser");
        authorityFacade.addAuthority(superUser);


        AuthorityDto user = new AuthorityDto();
        user.setName("user");
        authorityFacade.addAuthority(user);

        AuthorityDto a1 = authorityFacade.getAuthority("superUser");
        AuthorityDto a2 = authorityFacade.getAuthority("user");

        List<AuthorityDto> authorityDtos1 = new ArrayList<AuthorityDto>();
        authorityDtos1.add(a1);
        authorityDtos1.add(a2);

        RoleDto adminRole = new RoleDto();
        adminRole.setName("admin");
        adminRole.setAuthorities(authorityDtos1);
        roleFacade.addRole(adminRole);


        List<AuthorityDto> authorityDtos2 = new ArrayList<AuthorityDto>();
        authorityDtos2.add(a2);


        RoleDto userRole = new RoleDto();
        userRole.setName("user");
        userRole.setAuthorities(authorityDtos2);
        roleFacade.addRole(userRole);

        RoleDto r1 = roleFacade.getRole("admin");
        RoleDto r2 = roleFacade.getRole("user");

        List<RoleDto> roles1 = new ArrayList<RoleDto>();
        roles1.add(r1);
        roles1.add(r2);

        UserDto user1 = new UserDto();
        user1.setUserId("kourosh");
        user1.setPassword("123");
        user1.setRoles(roles1);

        ///////////////////////////////////
        List<RoleDto> roles2 = new ArrayList<RoleDto>();
        roles2.add(r2);


        UserDto user2 = new UserDto();
        user2.setUserId("ali");
        user2.setPassword("234");
        user2.setRoles(roles2);


        userFacade.addUser(user1);
        userFacade.addUser(user2);


        return "user added";
    }
}
