package com.mybatis.book.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mybatis.book.model.vo.Book;
import com.mybatis.book.service.BookService;

/**
 * Servlet implementation class BookDetailServlet
 */
@WebServlet("/book/detail")
public class BookDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//밑에 경로는 list.jsp에서 쿼리문 적힌?곳 적기 =왼쪽꺼!getParameter!!
		BookService bService = new BookService();
		//에러나면 밑에 코드 다시 보기!!
		int bookNo = (request.getParameter("bookNo") != null)
				? Integer.parseInt(request.getParameter("bookNo")) : 1;
		Book book = bService.selectOneByNo(bookNo);
		if(book != null) {
			request.setAttribute("book", book);
			request.getRequestDispatcher("/WEB-INF/views/book/detail.jsp")
			.forward(request, response);
		}else {
			//실패시 에러페이지이동!!
			request.getRequestDispatcher("")
			.forward(request, response);
		}
	}

}
