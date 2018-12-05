package com.example.demo.entity;

import lombok.Data;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Data
public class User {

    private Integer pid;
    private String password;
    private String gender;
    private String phone;
    private String authority;

}
