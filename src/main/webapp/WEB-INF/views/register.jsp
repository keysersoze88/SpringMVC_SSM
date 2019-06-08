<%--
  Created by IntelliJ IDEA.
  User: l4984
  Date: 2019/6/8
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<div>
    <form id="zc" action="/user/register" method="post">
        userName: <input type="text" required id="name" name="name"><br>
        password: <input type="password" required id="pw" name="password"><br>
        <input type="submit" value="register">
        <input type="button" value="login" onclick="location.href='/user/login'">
    </form>
</div>
</body>
<script>
    var a = '${status}';
    if (a != ''){
        if (a == 0){
            alert('register success,jumping...');
            location.href = '/user/userinfo';
        }else if (a == 1){
            alert('user save error');
        }else if (a == 2) {
            alert('user already exist');
        }
    }
</script>
</html>
