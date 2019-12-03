<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/27 0027
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<h1>学生新增<%=System.currentTimeMillis()%></h1>

<f:form modelAttribute="student" action="${ctx}/stu/add" method="post">
    <div>sid:<f:input path="sid"></f:input></div>
    <div>sname:<f:input path="sname"></f:input></div>
    <div>age:<f:input path="age"></f:input></div>
    <div>remark:<f:textarea path="remark"></f:textarea></div>
    <input type="submit" value="确定">
</f:form>

</body>
</html>
