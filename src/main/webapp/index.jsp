<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/message/go">跳转</a>
<div>
    用户名: <input type="text" id="userName" name="userName" />
    <input type="button" value="查找用户" onclick="javascript:window.open('/message/detail/data='+document.getElementById('userName').value)">
</div>
<h2>form------------get</h2>
<div>
    <form id="reportGet" action="/message/report" method="get">
        begin:<input type="text" name="begin" ><br>
        end:<input type="text" name="end"><br>
        <input type="submit" value="GET提交">
    </form>
</div>
<h2>form------------psot</h2>
<div>
    <form id="reportPost" action="/message/report1" method="post">
        begin:<input type="text" name="begin" ><br>
        end:<input type="text" name="end"><br>
        <input type="submit" value="POST提交">
    </form>
</div>
</body>
</html>
