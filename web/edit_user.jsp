<%-- 
    Document   : register
    Created on : 31/07/2018, 8:11:16 PM
    Author     : SRD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="uts.wsd.*" %><% User user = new User(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <% User loggedUser = (User)session.getAttribute("userLogged");
       %>
        <h1>Register</h1>
        <form method="POST" action="welcome.jsp">
            <table>
                <tr><td>Email</td><td> <input name="email" value="<%= loggedUser.getEmail()%> " type="text"></td><tr>
                <tr><td>Full name</td><td> <input name="name" value="<%= loggedUser.getName()%> " type="text"></td><tr>
                <tr><td>Password</td><td> <input name="password"  value="<%= loggedUser.getPassword()%> " type="password"></td><tr>
                <tr><td>Gender</td><td> 
                        <input type="radio" name="gender" value="male" checked="true"> Male<br>
                        <input type="radio" name="gender" value="female"> Female<br>

                    </td><tr>
                <tr><td>Favourite colour</td><td> 
                        <select name="favcol" value="<%= loggedUser.getFavColor()%> ">
                            <option value="Red">Red</option>
                            <option value="Green">Green</option>
                            <option value="Blue">Blue</option>
                            <option value="Yellow">Yellow</option>
                            <option value="orange">orange</option>
                            <option value="pink">pink</option>
                        </select>

                    </td><tr>
                <tr><td>Agree to TOS</td><td> 
                        <input type="checkbox" name="tos" checked="true"></td><tr>
                <tr><td></td><td> 
                        <input type="submit" value="Save"></td><tr>
            </table>
        </form>
                
                
                <p>Return to the <a href="index.jsp">main page</a>.</p>
    </body>
</html>
