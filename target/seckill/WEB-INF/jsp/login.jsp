<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>请登录</h1>
	<form action="/sso/doLogin" method="post">
		<span>用户名：</span><input type="text" name="username"/><br>
		<span>密码：</span><input type="text" name="password"/><br>
		<input type="submit"><br>
	</form>
</center>
</body>
</html>