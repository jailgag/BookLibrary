package com.ddomybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	
	//*여기는 연결만 만드는곳이고!
	//가져다 쓰는것은 service다!!
	
	//1.코드작성!
	public static SqlSession getSqlSession() {
		
		//2작성!내가 사용할 연결을 저장할 변수
		SqlSession session = null;
		
		//3.작성!!xml 파일 경로 저장하는 변수
		String resource="mybatis-config.xml";
		
		//4.밑에코드 작성후 트라이캐치!
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			//5.밑에코드 작성 
			//공정 기술자
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			//공정
			SqlSessionFactory factory = builder.build(is);
			//밑에코드()안에 true면 자동컴밋 false면 자동커밋끄는것!! 
			session = factory.openSession(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return session;
		
	}
}
