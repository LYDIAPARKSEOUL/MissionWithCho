<%@page contentType="text/html; charset=UTF-8" %>

<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	
	int updateCount=0;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = null;
	PreparedStatement pstmt  = null;
	
	
	try{
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");// DB와 연결된 Connection 생성
		conn.setAutoCommit(false); // 오토커밋 자동 방지설정
		
		 // 각 쿼리 실행
// 		pstmt = conn.prepareStatement("SELECT * FROM RUDICHART");
		pstmt = conn.prepareStatement("DELETE FROM RUDICHART WHERE NAME ='전지현'");
		pstmt = conn.prepareStatement("INSERT INTO RUDICHART (NAME, AGE, GENDER)  VALUES ('전지현' , 12 , 1)");
		pstmt = conn.prepareStatement("UPDATE RUDICHART SET NAME='박루디아' WHERE NAME ='전지현'");
		
		conn.commit(); // 실행결과를 commit한다.
		
		
	}  catch(SQLException sqle){
		if(conn!=null) try{conn.rollback(); }catch(SQLException ex){}   // SQL 예외 발생시 rollback함
	}
	
		finally {
// 		conn.setAutoCommit(true); // 오토커밋 true로 변경해줘서 자동커밋
		if(pstmt != null) try {pstmt.close(); } catch(SQLException ex){}
		if(conn != null) try {conn.close(); } catch(SQLException ex){}
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>트랜젝션</title>
</head>
<body>
<h2>트랜젝션 </h2>
</body>
</html>