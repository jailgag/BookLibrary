package com.mybatis.book.model.vo;

public class Book {
	private int bookNo; //책번호
	private String bookName; //제목
	private String bookWrite; //글쓴이
	private int bookPrice; //가격
	private String publisher; //출판사
	private String genre; //장르
	
	public Book() {}

	
	
	public int getBookNo() {
		return bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookWrite() {
		return bookWrite;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", bookWrite=" + bookWrite + ", bookPrice="
				+ bookPrice + ", publisher=" + publisher + ", genre=" + genre + "]";
	} 
	
	
}
