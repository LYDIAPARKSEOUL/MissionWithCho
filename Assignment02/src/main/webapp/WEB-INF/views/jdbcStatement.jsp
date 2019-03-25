<%@page contentType="text/html; charset=UTF-8" %>

<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	
	int updateCount=0;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = null;
	Statement stmt  = null;
	
	try{
		String query = "UPDATE STUDENT SET NAME = '"+name+"' "+ 
							"WHERE ID = '" + id+"' ";
		// STUDENT 테이블의 NAME, ID 컬럼을 UPDATE 쿼리 
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");// DB와 연결된 Connection 생성
		stmt = conn.createStatement(); // Connection으로부터 Statement 생성
		updateCount = stmt.executeUpdate(query);
		// Statement의 executeUpdate() 메소드를 사용해 쿼리실행
		// 실행결과로 변경된 레코드의 개수가 updateCount 변수에 저장됨
	} finally {
		if(stmt != null) try {stmt.close(); } catch(SQLException ex){}
		if(conn != null) try {conn.close(); } catch(SQLException ex){}
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>이름을 변경해보자</title>
</head>
<body>
김신영 아이디 bingo 를 rudia로 변경해보기.

<% if(updateCount >0 ) { %>
<%= id %> 의 이름을 <%=name %>으로 변경합니다.
<%} else { %>
<%= id %> 아이디 존재 하지 않습니다.
<%} %>
</body>
</html>