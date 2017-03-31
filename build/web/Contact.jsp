<%-- 
    Document   : Contact
    Created on : Sep 23, 2016, 6:52:30 PM
    Author     : Parth Makadiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" >
	<link rel="stylesheet" href="css/bootstrap.min.css">
        
        <title><%= request.getParameter("title") %></title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <div class="container">
            <h1>
                Sorry Under maintaince 
                <a href="http://alltricks007.blogspot.in/">Click here</a>
            </h1>
        </div>
         <%@include file="Footer.jsp" %>
       
    </body>
</html>
