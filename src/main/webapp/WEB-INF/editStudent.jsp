
<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>

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

    form {
        width: 400px;
        margin: auto;
        background-color: white;
        padding: 25px;
        border-radius: 8px;
    }

    label {
        display: block;
        margin-top: 12px;
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        box-sizing: border-box;
    }

    button {
        margin-top: 20px;
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        color: white;
        border: none;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>

<body>

<h2>Edit Student Details</h2>

<form action="updateStudent"
      method="post">

    <input type="text" name="id" value="${student.id}"readonly>

    <label>First Name</label>
    <input type="text" name="fname" value="${student.fname}" required>

    <label>Last Name</label>
    <input type="text" name="lname" value="${student.lname}" required>

    <label>Email</label>
    <input type="email" name="email" value="${student.email}" required>

    <label>Age</label>
    <input type="number" name="age" value="${student.age}" required>

    <label>City</label>
    <input type="text" name="city" value="${student.city}" required>

    <label>State</label>
    <input type="text" name="state" value="${student.state}" required>

    <button type="submit">Update Student</button>

</form>

</body>
</html>
