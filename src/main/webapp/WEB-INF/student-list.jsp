
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
isELIgnored="false"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        padding: 30px;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        background-color: white;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 12px;
        text-align: center;
    }

    th {
        background-color: #007bff;
        color: white;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>

<body>

<h2>Student Details</h2>

<table>

    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Age</th>
        <th>City</th>
        <th>State</th>
        th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach var="student" items="${studentlist}">

        <tr>
            <td>${student.id}</td>
            <td>${student.fname}</td>
            <td>${student.lname}</td>
            <td>${student.email}</td>
            <td>${student.age}</td>
            <td>${student.city}</td>
            <td>${student.state}</td>
            
        <td>
            <a href="editStudent?id=${student.id}">
                Edit
            </a>
        </td>

        <td>
            <a href="deleteStudent?id=${student.id}"
               onclick="return confirm('Are you sure you want to delete this student?');">
                Delete
            </a>
        </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
