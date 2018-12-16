package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public boolean insert(User user) {
        if (null == user){
            return false;
        }
        // do something...
        userDAO.insert(user);
        return true;
    }

    @Override
    public List<User> logincheck() {
        return userDAO.logincheck();
    }

    @Override
    public boolean dologin(User user)
    {
        System.out.print("接口中的logincheck");
        System.out.println(this.userDAO.logincheck());

        if(this.userDAO.logincheck() != null || this.userDAO.logincheck().size() !=0 ){
            return true;
        }else{
            return false;
        }
    }
}
