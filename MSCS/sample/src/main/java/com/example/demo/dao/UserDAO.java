package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDAO {

    @Select(value = "SELECT * FROM user")
    List<User> getAllUser();

    @Insert({"insert into user(id,username,password,name,gender,phone,authority) values(#{id},#{username},#{password},#{name},#{gender},#{phone},#{authority})"})

    int insert(User user);

    @Select({"select * from user where username=#{username} and password =#{password}"})

    List<User> logincheck();






//
//    @Update(value = "UPDATE user SET user.score = #{score} WHERE user.pid = #{pid}")
//    int update(Integer pid, Double score);

}
