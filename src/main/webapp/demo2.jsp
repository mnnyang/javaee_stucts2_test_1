<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xxyangyoulin
  Date: 18-8-29
  Time: 上午11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
demo2 page 中文
<br/>
<%--获取root下的值--%>
<s:property value="user"/><br/><%--直接toString 打印对象到html--%>
<s:property value="user.id"/><br/>
<s:property value="user.name"/><br/>
<s:property value="user.address.city" escape='false'/><br/>
<s:property value="user.address.city"/><br/>
<br/>
<br/>
<s:property value="#request.cn"/>
<br/>
<%--自动寻找request/session/application--%>
<s:property value="#attr.cn"/>

<br/>
#--><s:property value="#contextMap"/><%--可以--%>
!#-><s:property value="contextMap2"/><%--可以--%>

<%--请求参数--%>
<%--参数可以接在url上，
    也可以接在action中--%>
<%--
        <action name="demo2" class="cn.ognl.OgnlDemo2">
            <result name="success">/demo2.jsp?name=${#request.request_data}</result>
        </action>
--%>
<s:property value="#parameters.name"/>

<s:debug/>
</body>
</html>
