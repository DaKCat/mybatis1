<%--
  Created by IntelliJ IDEA.
  User: Cui
  Date: 2019/11/27
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
    <%--<jsp:include page="head.jsp"></jsp:include>--%>
</head>
<body>
<h1>书本新增<%=System.currentTimeMillis()%>
</h1>
<f:form modelAttribute="book" action="/book/add" method="post">
    <div>bookId:<f:input path="bookId"/></div>
    <div>bookName:<f:input path="bookName"/></div>
    <div>bookPrice:<f:input path="bookPrice"/></div>
    <div>bookBrief:<f:textarea path="bookBrief"/></div>
    <input type="submit" value="确定">
</f:form>
</body>
</html>
