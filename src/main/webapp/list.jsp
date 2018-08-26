<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-26
  Time: 下午3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <th>编号</th>
        <th>文件名</th>
        <th>操作</th>
    </tr>
    <c:forEach var="fileName" items="${fileNames}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${fileName}</td>
            <td>
                <c:url var="url" value="down">
                    <c:param name="fileName" value="${fileName}"/>
                </c:url>

                <a href="${url}">download</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
