package com.mybatis.customer.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.customer.common.SqlSessionTemplate;
import com.mybatis.customer.model.dao.CustomerDAO;
import com.mybatis.customer.model.vo.Customer;

public class CustomerService {
	
	
	private SqlSession conn;
	
	private CustomerDAO cDao;
	
	public CustomerService() {
		conn = SqlSessionTemplate.getSqlSession();
		cDao = new CustomerDAO();
	}
}
