<%--
  Created by IntelliJ IDEA.
  User: thanhngan
  Date: 9/24/2023
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thêm mới</h2>
<form:form modelAttribute="studentNew" action="/student/create" method="post">
    ID: <form:input path="id"/><br>
    Name:  <form:input path="name"/> <br>
    Gender:    <form:radiobutton path="gender" value="1" label="Nam"/>
     <form:radiobutton path="gender" value="0" label="Nữ"/>
      <form:radiobutton path="gender" value="-1" label="LGBT"/> <br>
    ClassName : <form:select path="className" items="${className}"/> <br>
    Language :  <form:checkboxes items = "${lan}" path = "languages" /><br>
    <form:button>SAVE</form:button>
</form:form>

</body>
</html>
