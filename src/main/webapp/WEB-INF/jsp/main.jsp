<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/24 0024
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<h1>上午好</h1>
<div>

    <div>
        <p><t:message code="username.label"></t:message>  </p>
        <p><t:message code="password.label"></t:message>  </p>
        <p>${hello}  </p>

    </div>
    <h1>main.jsp</h1>
    <%=System.currentTimeMillis()%>
    <br>
</div>

${name}
</body>
</html>
