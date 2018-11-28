package com.example.demo.entity;

import java.sql.Date;

public class Storage {

    private Integer sid;
    private String comname;
    private int inprice;
    private int outprice;
    private int number;
    private Date period;
    private int sale;
	Integer getSid() {
		return sid;
	}
	void setSid(Integer sid) {
		this.sid = sid;
	}
	String getComname() {
		return comname;
	}
	void setComname(String comname) {
		this.comname = comname;
	}
	int getInprice() {
		return inprice;
	}
	void setInprice(int inprice) {
		this.inprice = inprice;
	}
	int getOutprice() {
		return outprice;
	}
	void setOutprice(int outprice) {
		this.outprice = outprice;
	}
	int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number = number;
	}
	Date getPeriod() {
		return period;
	}
	void setPeriod(Date period) {
		this.period = period;
	}
	int getSale() {
		return sale;
	}
	void setSale(int sale) {
		this.sale = sale;
	}
	
    
	    
    
}
