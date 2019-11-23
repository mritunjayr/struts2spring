package com.ibm.springstruts.model;

import org.springframework.stereotype.Component;


public class Book {
	private String name;
	private String autherName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", autherName=" + autherName + "]";
	}
	
	

}
