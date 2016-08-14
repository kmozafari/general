package ir.kmozafari.general.webservice;

import ir.kmozafari.general.api.user.UserFacade;
import ir.kmozafari.general.common.dto.persistence.UserDto;
import ir.kmozafari.general.common.model.persistence.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kourosh on 8/8/16.
 */

@RestController
public class HelloWebService {


    @Autowired
    private UserFacade userFacade;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        UserDto userDto = new UserDto();
        userDto.setEmail("a@b.com");
        userDto.setPassword("123");
        userDto.setRole(Role.ADMIN);
        userFacade.addUser(userDto);
        return "user added";
    }
}
