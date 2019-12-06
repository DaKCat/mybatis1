<%--
  Created by IntelliJ IDEA.
  User: Cui
  Date: 2019/11/29
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
    <h1>文件上传</h1>
    <%--<form action="/upload" method="post" enctype="multipart/form-data">--%>
        <%--<input type="file" name="img">--%>
        <%--<input type="submit" value="确定">--%>
    <%--</form>--%>
    <form action="/upload2" method="post" enctype="multipart/form-data">
        <input type="file" name="imgs"><br>
        <input type="file" name="imgs"><br>
        <input type="file" name="imgs"><br>
        <input type="submit" value="确定">
    </form>
</body>
</html>
