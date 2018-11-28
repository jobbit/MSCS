package com.example.demo.entity;

import java.util.Date;

public class Sale {

    private Integer cid;
    private String proname;
    private String des;
    private Date exedate;
    private int pass;
    
	Integer getCid() {
		return cid;
	}
	void setCid(Integer cid) {
		this.cid = cid;
	}
	String getProname() {
		return proname;
	}
	void setProname(String proname) {
		this.proname = proname;
	}
	String getDes() {
		return des;
	}
	void setDes(String des) {
		this.des = des;
	}
	Date getExedate() {
		return exedate;
	}
	void setExedate(Date exedate) {
		this.exedate = exedate;
	}
	int getPass() {
		return pass;
	}
	void setPass(int pass) {
		this.pass = pass;
	}
	
    
    
}
