
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }

    .container {
        width: 400px;
        margin: 50px auto;
        padding: 25px;
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 0 10px gray;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    input {
        width: 100%;
        padding: 10px;
        margin: 8px 0 15px;
        box-sizing: border-box;
    }

    button {
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

<div class="container">

    <h2>Student Registration</h2>

    <form action="saveStudent" method="post">

        <label>First Name:</label>
        <input type="text" name="fname" required>

        <label>Last Name:</label>
        <input type="text" name="lname" required>

        <label>Email:</label>
        <input type="email" name="email" required>

        <label>Age:</label>
        <input type="number" name="age" required>

        <label>City:</label>
        <input type="text" name="city" required>

        <label>State:</label>
        <input type="text" name="state" required>

        <button type="submit">Register Student</button>

    </form>

</div>

</body>
</html>
