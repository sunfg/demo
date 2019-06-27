package com.sun.demo.service;

import com.sun.demo.dao.UserDao;
import com.sun.demo.entity.User;
import com.sun.demo.util.EntityMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {
    @Autowired
    private UserDao dao;


    public String saveUser(String useId,String userName) {
        User user = new User();
        try {
            EntityMsg.setInsertInfo(user);
            user.setLoginId(useId);
            user.setLoginName(userName);
            dao.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
