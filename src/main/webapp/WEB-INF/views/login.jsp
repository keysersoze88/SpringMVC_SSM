<%--
  Created by IntelliJ IDEA.
  User: l4984
  Date: 2019/6/8
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <form id="zc" action="/user/login" method="post">
        userName: <input type="text" required id="name" name="name"><br>
        password: <input type="password" required id="pw" name="password"><br>
        <input type="submit" value="login">
        <input type="button" value="register" onclick="location.href='/user/register'">
    </form>
</div>
</body>
<script>
    var a = '${status}';
    if (a != ''){
        if (a == 0){
            alert('login success,jumping...');
            location.href = '/user/userinfo';
        }else if (a == 1){
            alert('user not exist');
        }else if (a == 2) {
            alert('password error');
        }
    }
</script>
</html>
