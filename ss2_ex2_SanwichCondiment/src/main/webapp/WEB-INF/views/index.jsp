<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Nguyên liệu làm sandwich</h1>
<form action="/sand/wich" method="post">
    <table>
        <tr>
            <td><input type="checkbox" name="condiment" value="Lecttuce">Lecttuce</td>
            <td><input type="checkbox" name="condiment" value="Tomatto">Tomatto</td>
            <td><input type="checkbox" name="condiment" value="Mustart">Mustart</td>
            <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
        </tr>
        <tr>
            <td><button type="submit">SAVE</button></td>
        </tr>
    </table>
</form>
<p><c:out value="${result}"/></p>
</body>
</html>