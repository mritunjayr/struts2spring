package com.ibm.springstruts.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.springstruts.model.Book;
import com.opensymphony.xwork2.ActionSupport;

@Service
public class BookStoreAction extends ActionSupport{
	
	Book book;

	@Override
	public String execute() throws Exception {
		book=new Book();
		book.setName("The Rich Format");
		book.setAutherName("KIng Lown");
		return SUCCESS;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
