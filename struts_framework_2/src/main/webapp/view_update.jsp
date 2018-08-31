<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-31
  Time: 下午2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--原始写法--%>
<s:form action="#">

    用户名： <s:textfield name="user.userName" value="%{#request.user.name}"/> <br/>
    邮箱： <s:textfield name="user.email" value="%{#request.user.email}"/> <br/>
</s:form>

<%--数据回显 自动取根元素的值--%>
<s:form action="#">
    用户名： <s:textfield name="name"/> <br/>
    邮箱： <s:textfield name="email"/> <br/>
    邮箱： <s:textfield name="hah"/> <br/>
    <s:submit value="修改"/>
</s:form>

</body>
</html>
