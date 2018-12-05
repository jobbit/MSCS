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

    @Insert(value = "INSERT INTO user(user.`name`,user.`no`,user.score)\n" +
            "VALUE(#{name},#{no},#{score})")
    int insert(User user);

    @Update(value = "UPDATE user SET user.score = #{score} WHERE user.id = #{id}")
    int update(Integer id, Double score);

}
