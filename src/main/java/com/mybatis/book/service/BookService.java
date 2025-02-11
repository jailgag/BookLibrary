package com.mybatis.book.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.book.model.dao.BookDAO;
import com.mybatis.customer.common.SqlSessionTemplate;

public class BookService {
	
	private BookDAO bDao;
	
	private SqlSession session;
	
	public BookService() {
		bDao = new BookDAO();
		
		session = SqlSessionTemplate.getSqlSession();
	}
	
}
