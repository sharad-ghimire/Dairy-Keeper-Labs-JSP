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
        
        
        
        <%
            String submitted = request.getParameter("submitted");
            if (submitted != null && submitted.equals("yes")) {
               String name = request.getParameter("name");
               String email = request.getParameter("email");
               String password = request.getParameter("password");
               String gender = request.getParameter("gender");
               String color = request.getParameter("favcol");
               String check = request.getParameter("tos");    
               if(check == null) { %>
                    <body >
                        <p>Sorry, you must agree to the Terms if Service.</p>
                        <p>Click <a href="one.jsp">here</a> to go back.

                   </body>   
              <% } else { %>
                    <body  bgcolor="<%= color%>">

                        <p>Welcome, <%= name%>!</p>
                        <p>Your Email is <%= email %>.</p>
                        <p>Your password is <%= password %>.</p>
                        <p>Your gender is <%= gender %>.</p>
                        <p>Your favourite colour is <%= color %>.</p>
                    </body>
             <% } %>
          
                   
                   
                   
          <%  }  else { %>
    <body>
        <h1>Register</h1>
        <form method="POST" action="one.jsp">
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
                        
                        <input type="submit" value="Register">
                        <input type="hidden" name="submitted" value="yes">
                    </td><tr>
            </table>
        </form>
    </body>
    <%} %>
</html>
