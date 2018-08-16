<%-- 
    Document   : register
    Created on : 31/07/2018, 8:11:16 PM
    Author     : SRD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <form method="POST" action="welcome.jsp">
            <table>
                <tr><td>Email</td><td> <input name="email" type="text"></td><tr>
                <tr><td>Full name</td><td> <input name="name" type="text"></td><tr>
                <tr><td>Password</td><td> <input name="password" type="password"></td><tr>
                <tr><td>Gender</td><td> 
                        <input type="radio" name="gender" value="male"> Male<br>
                        <input type="radio" name="gender" value="female"> Female<br>

                    </td><tr>
                <tr><td>Favourite colour</td><td> 
                        <select name="favcol">
                            <option value="Red">Red</option>
                            <option value="Green">Green</option>
                            <option value="Blue">Blue</option>
                            <option value="Yellow">Yellow</option>
                            <option value="orange">orange</option>
                            <option value="pink">pink</option>
                        </select>

                    </td><tr>
                <tr><td>Agree to TOS</td><td> 
                        <input type="checkbox" name="tos" checked="false"></td><tr>
                <tr><td></td><td> 
                        <input type="submit" value="Register"></td><tr>
            </table>
        </form>
    </body>
</html>
