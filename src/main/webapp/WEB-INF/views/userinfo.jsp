<%--
  Created by IntelliJ IDEA.
  User: l4984
  Date: 2019/6/8
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userinfo</title>
</head>
<body>
<c:if test="${not empty user}">
    <div>欢迎您，${user.name} <a href="/user/logout">注销</a></div></div>
</c:if>
<c:if test="${ empty user}">
    对不起，请先<a href="/user/login">登录</a>
</c:if>
</body>
</html>
