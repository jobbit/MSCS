package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/

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
    public boolean update(Integer id, Double score) {
        if ( null == id || null  == score){
            return false;
        }
        // do something...
        userDAO.update(id,score);
        return true;
    }
}
