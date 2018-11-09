<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
    <script type="text/javascript">
        // window.location.href = "http://localhost:8080/MavenDemo/user/index";
        // window.location.href = "${pageContext.request.contextPath}/user/index";
    </script>
</head>
<body>
<h1>hello world!!!</h1>
<form action="${pageContext.request.contextPath}/user/login">
    新增书名:<input type="text" name="name"><br>
    号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="number"><br>
    详细信息:<input type="text" name="detail"><br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>