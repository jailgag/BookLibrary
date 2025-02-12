package com.mybatis.book.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.book.model.vo.Book;

public class BookDAO {
	
	//리스트(전체조회)
	public List<Book> selectList(SqlSession session) {
		// TODO Auto-generated method stub
		List<Book> bList = session.selectList("BookMapper.selectList",session);
		return bList;
	}
	
}
