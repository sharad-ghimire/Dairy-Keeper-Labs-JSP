<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>

        <h1>Register</h1>

        <form action="welcome.jsp" method="POST">

            <table>
                <tr><td>Email</td><td><input type="text" name="email"></td></tr>
                <tr><td>Full name</td><td><input type="text" name="name"></td></tr>
                <tr><td>Password</td><td><input type="password" name="password"></td></tr>
                <tr><td>Gender</td><td><input type="radio" name="gender" value="male">Male<br><input type="radio" name="gender" value="female">Female</td></tr>
                <tr><td>Favourite colour</td><td><select name="favcol"><option>red<option>green</select></td></tr>
                <tr><td>Agree to TOS</td><td><input type="checkbox" name="tos"></td></tr>
                <tr><td></td><td><input type="submit" value="Register"></td></tr>
            </table>

        </form>

    </body>
</html>