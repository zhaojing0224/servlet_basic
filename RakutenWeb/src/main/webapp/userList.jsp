<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>

    <h2>User List</h2>

    <table border="1">
        <thead>
            <tr>
            <th>Email</th>
                <th>User ID</th>
                <th>Name Sei</th>
                <th>Name Mei</th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <tbody>
            <%-- Use Java code to iterate over the userList --%>
            <% java.util.List userList = (java.util.List)request.getAttribute("userList"); %>
            <% for (int i = 0; i < userList.size(); i++) { %>
                <% object.UserInfoObj user = (object.UserInfoObj)userList.get(i); %>
                <tr>
                    <td><%= user.getEmail() %></td>
                    <td><%= user.getUserId() %></td>
                    <td><%= user.getNameSei() %></td>
                    <td><%= user.getNameMei() %></td>
                    <!-- Add more cells as needed -->
                </tr>
            <% } %>
        </tbody>
    </table>

</body>
</html>
