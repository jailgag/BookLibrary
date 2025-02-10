package com.mybatis.customer.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.customer.model.vo.Customer;

public class CustomerDAO {
	
	//로그인!!
	public Customer selectOneByLogin(SqlSession session, Customer customer) {
		Customer result = session.selectOne("CustomerMapper.selectOneByLogin",customer);		
		return result;
	}
	
}
