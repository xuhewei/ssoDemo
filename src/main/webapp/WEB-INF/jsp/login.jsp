<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
<center>
    <h1>请登录</h1>
    <form action="/sso/doLogin" method="post">
        <input type="hidden" name="gotoUrl" value="${gotoUrl}"/>
        <span>用户名：</span><input type="text" name="username"/>
        <span>密码：</span><input type="password" name="password"/>
        <input type="submit">
    </form>
</center>
</body>
</html>