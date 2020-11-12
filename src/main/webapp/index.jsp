<%--
  Created by IntelliJ IDEA.
  User: 磊大大
  Date: 2020/11/12
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/fileUpload" method="post" enctype="multipart/form-data">
    上传<input type="file" name="file">
<input type="submit">提交上传</input>
</form>
</body>
</html>
