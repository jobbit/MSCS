package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @description 
* @aUthor Tim Lin
* @create 2018-07-01 
**/
@Mapper
public interface UserDAO {

    @Select(value = "SELECT * FROM User")
    List<User> getAllUser();

    @Insert(value = "INSERT INTO User(User.`name`,User.`no`,User.score)\n" +
            "VALUE(#{name},#{no},#{score})")
    int insert(User User);

    @Update(value = "UPDATE User SET User.score = #{score} WHERE User.id = #{id}")
    int Update(Integer id,Double score);

}
