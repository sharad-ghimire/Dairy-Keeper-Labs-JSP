<%-- 
    Document   : loginAction
    Created on : 16/08/2018, 7:50:07 PM
    Author     : sharad
--%>

<%@page import="uts.wsd.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Action Page</title>
    </head>
    <body>
        <% String filePath = application.getRealPath("WEB-INF/users.xml");%>
        <jsp:useBean id="dApp" class="uts.wsd.DiaryApplication" scope="application">
            <jsp:setProperty name="dApp" property="filePath" value="<%=filePath%>"/>
        </jsp:useBean>
        
        <%
//            DiaryApplication dApp = (DiaryApplication) application.getAttribute("diaryApplication");
//            
//            if (dApp == null) {
//                dApp = new DiaryApplication();
//                dApp.setFilePath(filePath);
//                application.setAttribute("diaryApplication", dApp);
//            }
//            
            Users users = dApp.getUsers();           
            String email  = request.getParameter("email");
            String password = request.getParameter("password");
            
            User user = users.login(email, password);
            
            if (user != null) {
                %>
                <p>Login successful. Click <a href="welcome.jsp">here</a> to return to the main page.
               
                <%
            }else{
            
%>
                <p>Password incorrect. Click <a href="login.jsp">here</a> to return to try again.
            <%}
        %> 
    </body>
</html>