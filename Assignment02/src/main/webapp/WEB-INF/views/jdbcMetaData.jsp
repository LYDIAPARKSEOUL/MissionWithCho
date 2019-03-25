<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
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
	ResultSetMetaData rsmd = null;
	
	try{
		String query = "SELECT * FROM RUDICHART";
// 		String query = "CREATE OR REPLACE VIEW  RUDIRU AS SELECT * FROM RUDICHART";
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");// DB와 연결된 Connection 생성
		pstmt = conn.prepareStatement(query); // 실행계획 생성
		rsmd = pstmt.getMetaData();
		 // ResultSetMetaData의 getColumnCount() 메소드는 컬럼의 개수 반환
		 int colCount = rsmd.getColumnCount();
		 List<String> list = new ArrayList<>() ;
		 Map<Integer, String> map = new HashMap<>();
		 
		 // 컬럼 목록 보여주기
		 for(int i = 1; i <= colCount; i++){
			list.add(rsmd.getColumnClassName(i));  
			map.put(i, rsmd.getColumnClassName(i));
		 }
			%>
		<h4>list 로 :</h4>  	<%= list  %> <p>
		<h4>map으로 :</h4>	<%= map  %>

	<%
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
<body> <h2>ResultSetMetaData 이용  </h2>
</body>
</html>