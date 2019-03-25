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
		String query = "UPDATE STUDENT SET NAME = ? WHERE ID = ? ";
		// STUDENT 테이블의 NAME, ID 컬럼을 UPDATE 쿼리 
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");// DB와 연결된 Connection 생성
		pstmt = conn.prepareStatement(query); // 실행계획 생성
		pstmt.setString(1, name);  // 바인딩 실행
		pstmt.setString(2, id);			// 바인딩 실행
		updateCount = pstmt.executeUpdate();
		// 실행결과로 변경된 레코드의 개수가 updateCount 변수에 저장됨
	} finally {
		if(pstmt != null) try {pstmt.close(); } catch(SQLException ex){}
		if(conn != null) try {conn.close(); } catch(SQLException ex){}
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>이름을 변경해보자</title>
</head>
<body>
박루디아를 다시 김신영으로..! bingo <p>

<% if(updateCount >0 ) { %>
<%= id %> 의 이름을 <%=name %>으로 변경합니다.
<%} else { %>
<%= id %> 아이디 존재 하지 않습니다.
<%} %>
</body>
</html>