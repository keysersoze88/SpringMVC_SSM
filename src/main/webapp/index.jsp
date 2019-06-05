<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/message/go">跳转</a>
<div>
    用户名: <input type="text" id="userName" name="userName" />
    <input type="button" value="查找用户" onclick="javascript:window.open('/message/detail/data='+document.getElementById('userName').value)">
</div>
</body>
</html>
