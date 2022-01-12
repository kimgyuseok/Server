package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
* Oracle 연결 클래스 
* @author in
* 
*/
public class DBUtil {
	
	/*
	* 데이터베이스에 접속합니다. 
	* @return 연결된 Connection 클래스
	* 
	*/
	public static Connection open() {
		
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "java1234";
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	/*
	* 데이터베이스에 접속합니다. 
	* @param hosh 연결된 데이터베이스 주소
	* @param id 연결할 계정명
	* @param pw 연결할 계정암호
	* @return 연결된 Connection 클래스
	* 
	*/
	
	
	public static Connection open(String host, String id, String pw) {
		
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@" + host + ":1521:xe";
				
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}







