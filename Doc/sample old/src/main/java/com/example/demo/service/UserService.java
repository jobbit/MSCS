package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/

public interface UserService {

	List<User> getAllUser();

    boolean insert(User user);

    boolean update(Integer pid,String password,String name,int gender
    		,String phone,String authority);

	
}
