

<%@page import="java.util.List, model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Kyle's Keels</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="mystyle.css">
    </head>
    <body>
        <h1><a href="home.html">Kyle's Keels</a></h1>
        <h2>Harbor Records</h2>
        <%
            List<User> mydata = (List<User>) request.getAttribute("mydata");
            out.println("<table>");
            for (User user : mydata) {
                out.println(user.inHTMLRowFormat());
            }
            out.println("</table>");
        %>
    </body>
</html>
