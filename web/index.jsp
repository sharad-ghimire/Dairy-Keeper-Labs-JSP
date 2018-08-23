<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="uts.wsd.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Diary Keeper</h1>
        <%
            User user = (User) session.getAttribute("user");
            User loggedUser = (User) session.getAttribute("loggedUser");
        %>


        <% if (user != null && loggedUser == null) {%>

        <div style="text-align: right; border: solid 1px black;">
            You are logged in as <%= user.getName()%> &lt;<%= user.getEmail()%>&gt;
        </div>
        <div style="text-align: right;">
            <a href="logout.jsp">Logout</a>
        </div>
        <ul>
            <li><a href="edit_user.jsp">My Account</a></li>
        </ul>

        <% } else if(loggedUser != null && user == null) { %>
        
        <div style="text-align: right; border: solid 1px black;">
            You are logged in as <%= loggedUser.getName()%> &lt;<%= loggedUser.getEmail()%>&gt;
        </div>
        <div style="text-align: right;">
            <a href="logout.jsp">Logout</a>
        </div>
        <ul>
            <li><a href="edit_user.jsp">My Account</a></li>
        </ul>
        
        <% } else { %>

        <div style="text-align: right; border: solid 1px black;">
            You are not logged in
        </div>
        <div style="text-align: right;">
            <a href="login.jsp">Login</a> | <a href="register.jsp">Register</a>
        </div>

        <% }%>

    </body>
</html>
