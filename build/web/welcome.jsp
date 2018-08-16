<%-- 
    Document   : welcome
    Created on : 31/07/2018, 8:24:16 PM
    Author     : SRD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="uts.wsd.*" %><% User user = new User(); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%     
            String check = request.getParameter("tos");
        %>

    </head>
    <% if(check == null) { %>
        <body >
            <p>Sorry, you must agree to the Terms if Service.</p>
            <p>Click <a href="register.jsp">here</a> to go back.
        
       </body>   
   <% } else {
            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            user.setGender(request.getParameter("gender"));
            user.setFavColor(request.getParameter("favcol")); 
            //Session
            session.setAttribute("userLogged", user);
   %>
    <body  bgcolor="<%= user.getFavColor()%>">
        
        <p>Welcome, <%= user.getName() %>!</p>
        <p>Your Email is <%= user.getEmail() %>.</p>
        <p>Your password is <%= user.getPassword() %>.</p>
        <p>Your gender is <%= user.getGender() %>.</p>
        <p>Your favourite colour is <%= user.getFavColor() %>.</p>
        
        <p>Click <a href="index.jsp">here</a> to proceed to the main page.</p>
        
    </body>
   <% } %>
</html>
