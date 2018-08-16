<%-- 
    Document   : index
    Created on : 09/08/2018, 8:10:27 PM
    Author     : sharad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="uts.wsd.*" %><% User user = new User(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
        <style>
            .div {
                width: 500px;
                padding: 10px;
                border: 1px solid gray;
                
            }
            </style>
    </head>
    <body>
        <% 
         //if(session != null) {
         User loggedUser = (User)session.getAttribute("userLogged");
           
            
            if (loggedUser != null) {
                 
            
           
        %>
        
        <h1>Diary Keeper</h1>
        <div bgcolor="#808080">
        <p >You are logged in as <%= loggedUser.getName()%> &lt; <%= loggedUser.getEmail()%> &gt; </p>
        </div>
        
        <div style="float: right"><a href="logout.jsp">Logout</a></div>
        
        <ul><li><a href="edit_user.jsp">Account<a></li></ul>
        <%} else {%>
        
        <h1>Diary Keeper</h1>
        <div bgcolor="#808080">
        <p >You are not logged in </p>
        </div>
        <div style="float: right"><a href="register.jsp">Register</a></div>
        <% }%>
    </body>
</html>
