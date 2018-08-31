<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-31
  Time: 下午2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/model/index">
    用户名：<input type="text" name="name"><s:fielderror fieldName="user.name"/><br/>
    密码：<input type="text" name="pwd"><s:fielderror fieldName="user.pwd"/><br/>
    <input type="submit" value="登陆"><br/>
</form>
</body>
</html>
