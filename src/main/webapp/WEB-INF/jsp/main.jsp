<%--
  Created by IntelliJ IDEA.
  User: Cui
  Date: 2019/11/27
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<div>
    <p><t:message code="username.label"></t:message></p>
    <p><t:message code="password.label"></t:message></p>
    <p>${hello}</p>
</div>
<h1>main.jsp</h1>
<%=System.currentTimeMillis()%>
<div>
    ${name}
</div>
</body>
</html>
