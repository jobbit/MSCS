package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Mapper
public interface UserDAO {

    @Select(value = "SELECT * FROM user")
    List<User> getAllUser();

    @Insert({"insert into user(id,password,name,gender,phone,authority) values(#{id},#{password},#{name},#{gender},#{phone},#{authority})"})

    int insert(User user);

    @Select({"select * from users where username=User.getUsername() and password =User.getPassword()"})
    List<User> logincheck();

//
//    @Update(value = "UPDATE user SET user.score = #{score} WHERE user.pid = #{pid}")
//    int update(Integer pid, Double score);

}
