<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="uts.wsd.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>

        <%
            User user = (User) session.getAttribute("user");
            User registeredUser = (User) session.getAttribute("user");
            if (request.getParameter("email") != null) {
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String gender = request.getParameter("gender");
                String favouriteColour = request.getParameter("favcol");
                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
                user.setGender(gender);
                user.setFavouriteColour(favouriteColour);
        %>
        <p>Details updated.</p>
        <%
            }
        %>

        <h1>My Account</h1>

        <form action="edit_user.jsp" method="POST">

            <table>
                <tr><td>Email</td><td><input type="text" value="<%= user.getEmail()%>" name="email"></td></tr>
                <tr><td>Full name</td><td><input type="text" value="<%= user.getName()%>" name="name"></td></tr>
                <tr><td>Password</td><td><input type="password" value="<%= user.getPassword()%>" name="password"></td></tr>
                <tr><td>Gender</td><td><input type="radio" name="gender" value="male" <%= "male".equalsIgnoreCase(user.getGender()) ? "checked" : ""%>>Male<br><input type="radio" name="gender" value="female" <%= "female".equalsIgnoreCase(user.getGender()) ? "checked" : ""%>>Female</td></tr>
                <tr><td>Favourite colour</td><td><select name="favcol">
                            <option <%= "Red".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Red<option>
                            <option <%= "Green".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Green<option>
                            <option <%= "Blue".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Blue<option>
                            <option <%= "Yellow".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Yellow<option>
                            <option <%= "Orange".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Orange<option>
                            <option <%= "Pink".equalsIgnoreCase(user.getFavouriteColour()) ? "selected" : ""%>>Pink<option>
                        </select></td></tr>
                <tr><td></td><td><input type="submit" value="Save"></td></tr>
            </table>

            <p>Return to the <a href="index.jsp">main page</a>.</p>

        </form>

    </body>
</html>