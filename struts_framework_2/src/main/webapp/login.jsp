<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-30
  Time: 上午9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/user/login">
    用户名：<input type="text" name="user.name"><s:fielderror fieldName="user.name"/><br/>
    密码：<input type="text" name="user.pwd"><s:fielderror fieldName="user.pwd"/><br/>
    <input type="submit" value="登陆"><br/>
</form>
</body>
</html>
