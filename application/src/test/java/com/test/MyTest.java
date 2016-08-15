package com.test;

import ir.kmozafari.application.Application;
import ir.kmozafari.general.business.user.internal.api.UserService;
import ir.kmozafari.general.common.model.persistence.Role;
import ir.kmozafari.general.persistence.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kourosh on 8/13/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {Application.class})
@ActiveProfiles(profiles = {"h2test"})

public class MyTest {

    @Autowired
    private UserService userService;

    @Before
    public void addData() {
//
//        User user = new User();
//        user.setEmail("a@b.com");
//        user.setPassword("aaaaaa");
//        user.setRole(Role.ADMIN);
//
//        userService.addUser(user);
    }


    @Test
    public void name() throws Exception {
//        User user = new User();
//        user.setEmail("e@n.com");
//        user.setPassword("bbbbb");
//        user.setRole(Role.USER);
//        userService.addUser(user);
//
//        User u = userService.getUserByEmail("a@b.com");
//        System.out.println(u.getEmail() + " " + u.getPassword());
//        System.out.println("hi in test");
    }
}
