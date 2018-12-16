package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;


public interface UserService {

    List<User> getAllUser();

    boolean insert(User user);

    List<User> logincheck();

    boolean dologin(User user);


}
