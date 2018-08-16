<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="uts.wsd.*"%>


<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String gender = request.getParameter("gender");
    String favouriteColour = request.getParameter("favcol");
    String agreeTOS = request.getParameter("tos");
    

    


%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <%
        
        String filePath = application.getRealPath("WEB-INF/users.xml");
        DiaryApplication dApp = new DiaryApplication();
        dApp.setFilePath(filePath);
        Users users = dApp.getUsers();
        
              
        
        %>
    <body bgcolor="<%= favouriteColour%>">

        <%
            if (agreeTOS != null) {
                User user = new User(email, name, password, gender, favouriteColour);
                session.setAttribute("user", user);
                
                users.addUser(user);
                dApp.updateXML(users, filePath);
                

        %>

        <p>Welcome, <%= name%>!</p>

        <p>Your Email is <%= email%>.</p>

        <p>Your password is <%= password%>.</p>

        <p>Your gender is <%= gender%>.</p>

        <p>Your favourite colour is <%= favouriteColour%>.</p>

        <p>Click <a href="index.jsp">here</a> to proceed to the main page.</p>

        <%
        } else {
        %>
        <p>Sorry, you must agree to the Terms of Services.</p>
        <p>Click <a href="register.jsp">here</a> to go back.</p>
        <%
            }
        %>

    </body>
</html>
