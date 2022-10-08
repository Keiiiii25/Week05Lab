<%-- 
    Document   : login
    Created on : 7-Oct-2022, 3:08:41 PM
    Author     : Keith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            <p>
                Username: 
                <input type="text" name="username" value="${username}">
                <br>
                Password:
                <input type="text" name="password" value="${password}">
                <br>
                <input type="submit" name="login" value="Log in">
            </p>
        </form>
                
        <p>${message}</p>
    </body>
</html>
