package com.sun.demo.controller;

import com.sun.demo.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerRun {
@Autowired
    private ServiceUser user;
    @GetMapping(value = "save")
    public String  setUser(String userId,String userName ) {

        return  user.saveUser(userId,userName);
    }
}
