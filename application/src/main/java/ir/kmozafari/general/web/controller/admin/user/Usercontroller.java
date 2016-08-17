package ir.kmozafari.general.web.controller.admin.user;

import ir.kmozafari.general.api.security.AuthorityFacade;
import ir.kmozafari.general.api.security.RoleFacade;
import ir.kmozafari.general.api.security.UserFacade;
import ir.kmozafari.general.common.dto.persistence.AuthorityDto;
import ir.kmozafari.general.common.dto.persistence.RoleDto;
import ir.kmozafari.general.common.dto.persistence.UserDto;
import ir.kmozafari.general.web.controller.model.ReturnObject;
import ir.kmozafari.general.web.controller.model.RoleAddInfo;
import ir.kmozafari.general.web.controller.model.UserAddInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kourosh on 8/11/16.
 */

@Controller
@RequestMapping("/admin/user")
public class Usercontroller {

    @Autowired
    private UserFacade userFacade;

    @Autowired
    private RoleFacade roleFacade;

    @Autowired
    private AuthorityFacade authorityFacade;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getUserAddPage(ModelMap model) {
        List<RoleDto> allRoles = roleFacade.getAllRoles();
        model.put("roles", allRoles);
        return new ModelAndView("/admin/user/add", model);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public
    @ResponseBody
    ReturnObject addUSer(@RequestBody UserAddInfo userAddInfo) {
        UserDto userDto = new UserDto();
        userDto.setUserId(userAddInfo.getUserId());
        userDto.setPassword(userAddInfo.getPassword());
        userDto.setRoles(new ArrayList<RoleDto>());

        for (String s : userAddInfo.getRoles()) {
            RoleDto role = roleFacade.getRole(Long.valueOf(s));
            userDto.getRoles().add(role);
        }
        userFacade.addUser(userDto);
        return new ReturnObject("SUCCESS");
    }


    @RequestMapping(value = "/role/add", method = RequestMethod.POST)
    public
    @ResponseBody
    ReturnObject addRole(@RequestBody RoleAddInfo roleAddInfo) {

        RoleDto roleDto = new RoleDto();
        roleDto.setName(roleAddInfo.getName());
        roleDto.setAuthorities(new ArrayList<AuthorityDto>());

        for (String s : roleAddInfo.getAuthorities()) {
            AuthorityDto authority = authorityFacade.getAuthority(Long.valueOf(s));
            roleDto.getAuthorities().add(authority);
        }
        roleFacade.addRole(roleDto);
        return new ReturnObject("SUCCESS");
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getUserViewPage(ModelMap model) {
        List<UserDto> allUsers = userFacade.getAllUsers();
        model.put("users", allUsers);
        return new ModelAndView("/admin/user/view", model);
    }

    @RequestMapping(value = "/role/add", method = RequestMethod.GET)
    public ModelAndView getRoleAddPage(ModelMap model) {
        List<AuthorityDto> allAuthorities = authorityFacade.getAllAuthorities();
        model.put("authorities", allAuthorities);
        return new ModelAndView("/admin/user/role/add", model);
    }
}
