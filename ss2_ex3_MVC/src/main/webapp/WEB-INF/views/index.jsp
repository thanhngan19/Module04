<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<table>
    <tr>
        <td>STT</td>
        <td>Name</td>
        <td>ClassName</td>
        <td>Gender</td>
        <td>Language</td>
    </tr>
    <c:forEach items="${students}" varStatus="loop" var="student">
        <tr>
            <td><c:out value="${student.getId()}"/></td>
            <td><c:out value="${student.getName()}"/></td>
            <td><c:out value="${student.getClassName()}"/></td>
            <c:if test="${student.getGender()==0}">
                <td>Nam</td>
            </c:if>
            <c:if test="${student.getGender()==1}">
                <td>Nữ</td>
            </c:if>
            <td>
                <c:forEach items="${student.getLanguages()}" var="lan">
                    <span>${lan}</span>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/student/create">Thêm mới</a>
</body>
</html>