package com.test24spring.web;

import com.test24spring.db.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/public")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/")
    public String home2() {
        return "Hello World!";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        List<Map<String, Object>> allUsers = userDao.getAllUsers();
        return "users:"+ allUsers;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}