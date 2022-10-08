<%-- 
    Document   : home
    Created on : 7-Oct-2022, 3:26:17 PM
    Author     : Keith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <form>
            <p>
                <b>Hello ${username}.</b>
            </p>
        </form>
            <a href="login?logout">Log out</a>
    </body>
</html>
