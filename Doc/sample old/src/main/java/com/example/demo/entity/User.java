package com.example.demo.entity;



public class User {

    private Integer pid;
    private String password;
    private String phone;
    private String name;
    private String gender;
    private String authority;
	
    Integer getPid() {
		return pid;
	}
	void setPid(Integer pid) {
		this.pid = pid;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	String getAuthority() {
		return authority;
	}
	void setAuthority(String authority) {
		this.authority = authority;
	}
    
	    
    
}
