<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-26
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/upload"
      enctype="multipart/form-data">
    文件<input type="file" name="file1">
    提交<input type="submit">
</form>
</body>
</html>

