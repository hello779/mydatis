<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/30 0030
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>

<h1>文件上传<%=System.currentTimeMillis()%></h1>

<form action="${ctx}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="img1"><br>
    <input type="submit" value="确定">
</form>

<%--<form action="${ctx}/upload2" method="post" enctype="multipart/form-data">--%>
    <%--<input type="file" name="imgs"><br>--%>
    <%--<input type="file" name="imgs"><br>--%>
    <%--<input type="file" name="imgs"><br>--%>
    <%--<input type="submit" value="确定">--%>
<%--</form>--%>

</body>
</html>
