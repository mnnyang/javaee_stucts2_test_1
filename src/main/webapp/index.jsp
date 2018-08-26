<html>
<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/hello">
    name<input type="text" name="user.name">
    pwd<input type="text" name="user.pwd">
    <input type="submit">
</form>
</body>
</html>
