package ir.kmozafari.general.web.controller;

import ir.kmozafari.general.business.user.internal.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kourosh on 8/11/16.
 */

@Controller
public class Usercontroller {

    @Autowired
    private UserService userService;


    @RequestMapping("/users")
    public ModelAndView getUserPage(){
        return new ModelAndView("users","users",userService.getAllUsers());
    }
}
