package com.mybatis.customer.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.mybatis.customer.model.vo.Customer;
import com.mybatis.customer.service.CustomerService;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customer/login")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/include/login.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		Customer customer = new Customer(userId, userPw);
		CustomerService cService = new CustomerService();
		Customer result = cService.selectOneByLogin(customer);
		
		if(result != null) {
			//성공시 메인페이지로이동!
			HttpSession session = request.getSession();
			session.setAttribute("userId", result.getUserId());
			session.setAttribute("userName", result.getUserName());
			response.sendRedirect("/");
		}else {
			//실패시 에러페이지로이동!
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp")
			.forward(request, response);
		}
	}

}
