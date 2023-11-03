<%--
  Created by IntelliJ IDEA.
  User: thanhngan
  Date: 9/18/2023
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css" />
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css" />
    <link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.27/dist/sweetalert2.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <style>
        .center{
            text-align: center;

        }
        body {
            font-family: "Open Sans", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen-Sans, Ubuntu, Cantarell, "Helvetica Neue", Helvetica, Arial, sans-serif;
        }
    </style>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
<table id="tableHouseHold" class="table table-striped table-hover table table-striped table-bordered">
    <thead>
    <tr>
        <th >STT</th>
        <th >ID</th>
        <th >Name</th>
        <th >Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${student}" var="student" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${student.getId()}</td>
            <td>${student.getName()}</td>
            <td><a href="/students/edit?id=student.getId()" role="button"  class="btn btn-primary"> Edit</a></td>
            <td><a href="" role="button"  class="btn btn-primary"> Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
        </div>
    </div>
</div>


</body>
</html>
