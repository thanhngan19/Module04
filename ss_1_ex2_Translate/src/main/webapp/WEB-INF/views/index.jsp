<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Từ điển</h2>
<form action="/word/trans" method="post">
    <table>
        <tr>
            <td>Which language you want :</td>
            <td><input type="checkbox" name="vie" value="vie">Vie-Eng</td>
            <td><input type="checkbox" name="eng" value="end">End-Vie</td>
        </tr>
        <tr>
            <td>Input Youur Word </td>
            <td><input type="text" name="word"></td>
            <td><button type="submit">Translate</button></td>
        </tr>
    </table>
</form>

<p>Kết quả : <c:out value="${result}"/></p>
<p><c:out value="${alert}"/></p>
</body>
</html>