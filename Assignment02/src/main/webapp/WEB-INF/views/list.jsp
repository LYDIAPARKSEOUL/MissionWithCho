<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>리스트</title>
</head>
<body>
<hr>
<h1>방</h1>
<table border="1">
	<thead>
		<tr><td>이름</td> <td>나이</td> <td>아이디</td></tr>
	</thead>
	<tbody>
<c:forEach var="item"  items="${student }">
		<tr><td>${item.name }</td>
		<td>${item.age }</td>
		<td>${item.id }</td></tr>
</c:forEach>
	</tbody>
</table>
</body>
</html>