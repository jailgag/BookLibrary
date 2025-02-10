package com.mybatis.customer.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.customer.common.SqlSessionTemplate;
import com.mybatis.customer.model.dao.CustomerDAO;
import com.mybatis.customer.model.vo.Customer;

public class CustomerService {
	
	private CustomerDAO cDao;
	
	private SqlSession session;
	
	
	public CustomerService() {
		cDao = new CustomerDAO();
		
		session = SqlSessionTemplate.getSqlSession();
	}
	//로그인서블릿에서 넘어옴!!
	public Customer selectOneByLogin(Customer customer) {
		Customer result = cDao.selectOneByLogin(session,customer);
		return result;
	}
}
