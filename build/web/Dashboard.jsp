<%-- 
    Document   : Dashboard
    Created on : Sep 23, 2016, 7:20:01 PM
    Author     : Parth Makadiya
--%>
<!docktype html>
<%@ page import="java.sql.*" %>

<% Class.forName("org.apache.derby.jdbc.ClientDriver"); %>
<html>
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" >
	<link rel="stylesheet" href="css/bootstrap.min.css"><!-   https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap-theme.css->
	<title>Trying Bootstrap</title>
	</head>
       
<style>
#borderdiv{border: 2px solid buttonface; boarder-style: ridge;}
.no-margin
{
margin:0px;
}
.no-padding
{
padding:0px;
}
.pg-align
{
    
	 margin: 0 auto;
}

</style>
<body>
    <%@include file="Header.jsp" %>

            <div class="jumbotron text-center" id="mydiv">
  <h1>Welcome ,User</h1>
  <p>Ask Your Question Answer the question you know .You will get point for Everything.</p>
</div>
    <script> setTimeout(function() {
    $('#mydiv').fadeOut('fast');
}, 10000); // <-- time in milliseconds
</script>

<div>
<div class="row">

    <div class="col-md-3" id="borderdiv">
        <p>sdsdsdsdsdsddddddddddsdsdsdsdsdsdsdsdsdsd <br/> jgggbsgf gjcjhvncgf kgjhsf kjhxjkfad   </p>
</div>
    
<div class="container col-md-6" id="borderdiv">
    <div class="row">
        <div class="col-md-4">
         <% 
             String usr="xx@xx";
            Connection connection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/PM", "PM", "PM");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from QUEANSW WHERE USERID='"+usr+"'"); 
        %>
         
        <% while(resultset.next()){ %>
             <div class="container">
                 <div class="col-md-1" id="borderdiv"> <%= resultset.getString(1) %></td></div>
                 <div class="col-md-12" id="borderdiv"><TD> <%= resultset.getString(2) %></TD></div>              
             </div>
        <% } %>
            
            
        </div>
    </div>
</div>
<div class="col-md-3" id="borderdiv">
sdsdsdsdsdsddddddddddsdsdsdsdsdsdsdsdsdsd <br/> jgggbsgf gjcjhvncgf kgjhsf kjhxjkfad   
</div>
    
</div>
</div>    
  
   <%@include file="Footer.jsp" %>

<script src="js/jquery-2.1.4.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>