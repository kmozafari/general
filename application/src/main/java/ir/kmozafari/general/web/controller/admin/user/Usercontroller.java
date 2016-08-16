package ir.kmozafari.general.web.controller.admin.user;

import ir.kmozafari.general.api.security.RoleFacade;
import ir.kmozafari.general.api.security.UserFacade;
import ir.kmozafari.general.common.dto.persistence.RoleDto;
import ir.kmozafari.general.common.dto.persistence.UserDto;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getUserAddPage(ModelMap model) {
        List<RoleDto> allRoles = roleFacade.getAllRoles();
        model.put("roles", allRoles);
        return new ModelAndView("/admin/user/add", model);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = {"application/x-www-form-urlencoded","application/json"})
    public String addUSer(@RequestBody UserDto userDto) {
        System.out.println();
        return null;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getUserViewPage(ModelMap model) {
        List<UserDto> allUsers = userFacade.getAllUsers();
        model.put("users", allUsers);
        return new ModelAndView("/admin/user/view", model);
    }
}
