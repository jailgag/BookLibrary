package com.mybatis.book.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.book.model.dao.BookDAO;
import com.mybatis.book.model.vo.Book;
import com.mybatis.customer.common.SqlSessionTemplate;

public class BookService {
	
	private BookDAO bDao;
	
	private SqlSession session;
	
	public BookService() {
		bDao = new BookDAO();
		
		session = SqlSessionTemplate.getSqlSession();
	}
	//1.list서블릿에서 넘어옴!!(전체조회)
	public List<Book> selectListAll() {
		// TODO Auto-generated method stub
		List<Book> bList = bDao.selectList(session);
		return bList;
	}
	//2.write서블릿에서~!
	public int insertBook(Book book) {
		int result = bDao.insertBook(session,book);
		return result;
	}
	
}
