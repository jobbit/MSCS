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
// impl --> implements
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO UserDAO;

    @Override
    public List<User> getAllUser() {
        return UserDAO.getAllUser();
    }

    @Override
    public boolean insert(User User) {
        if (null == User){
            return false;
        }
        // do something...
        UserDAO.insert(User);
        return true;
    }

//    @Override
//    public boolean update(Integer id, Double score) {
//        if ( null == id || null  == score){
//            return false;
//        }
//        // do something...
//        UserDAO.update(id,score);
//        return true;
//    }

	@Override
	public boolean update(Integer pid, String password, String name, int gender, String phone, String authority) {
		// TODO Auto-generated method stub
		return false;
	}
}
