package com.example.demo.entity;

import lombok.Data;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Data
public class Student {

    private Integer id;
    private String no;
    private String name;
    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
