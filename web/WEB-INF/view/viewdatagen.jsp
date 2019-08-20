<%--
  Created by IntelliJ IDEA.
  User: STDJAVA04
  Date: 8/20/2019
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Data Gen</title>
    <script src="/resources/js/jquery-3.3.1.js"></script>
    <script src="/resources/js/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" href="/resources/css/jquery.dataTables.min.css">
</head>
<body>
<table id="example" class="display" style="width:100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${data}">
        <tr>
        <td><c:out value="${emp.name}" /></td>
        <td><c:out value="${emp.position}" /></td>
        <td><c:out value="${emp.office}" /></td>
        <td><c:out value="${emp.age}" /></td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Age</th>
    </tr>
    </tfoot>
</table>
</body>
</body>
<script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
</script>
</html>
