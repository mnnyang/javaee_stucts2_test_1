<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-29
  Time: 下午5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:iterator var="user" value="#request.list" status="st">
    <s:property value="#user.id"/><br/>
    <s:property value="#user.name"/><br/>
    <s:property value="#st.even"/><br/>
</s:iterator>

<s:iterator var="en" value="#request.map" status="st">
    <s:property value="#en.key"/><br/>
    <s:property value="#en.value.name"/><br/>
</s:iterator>

<br/>一、.构建 list集合</br>
<s:iterator var="str" value="{'a','b'}">
    <s:property value="#str"/>
</s:iterator>

<br/>一、.构建 map集合</br>
<s:iterator var="en" value="#{'cn':'China','usa':'America'}">
    <s:property value="#en.key"/>
    <s:property value="#en.value"/> <br/>
</s:iterator>

</body>
</html>
