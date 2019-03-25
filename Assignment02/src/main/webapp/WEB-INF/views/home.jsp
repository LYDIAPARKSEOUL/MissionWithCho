<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>홈</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<P>  The time on the server is ${serverTime}. </P>
<a href="/rudia" >return</a>
<a href="/rudia/list" >목록보기</a>
<a href="/rudia/json" >json</a>
<form action="getStudent" method="get">
<input type="text"  name="id" >
<input type="submit" value="눌러">
</form>
<form action="getStudent2" method="post">
<input type="text"  name="id" >
<input type="submit" value="눌러">
</form><p>
<hr>
<p>
<table>
	<thead>
		<tr>
		<td>이름</td>
		<td>나이</td>
		<td>아이디</td>
		</tr>
	</thead>
	<tbody>
		<tr>
		<td>${student.name }</td>
		<td>${student.age  }</td>
		<td>${student.id  }</td>
		</tr>
	</tbody>
</table>
<hr>

</body>
</html>
