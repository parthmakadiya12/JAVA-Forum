<!docktype html>
<html>
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" >
	<link rel="stylesheet" href="css/bootstrap.min.css"><!-   https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap-theme.css->
	<title>All Tricks Login</title>
	</head>
       
<style>
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


    
    
    <div class="container " class=".col-xs-4" align="center" style="border: thin solid black ">  
         <form action="DB2" method="post">
        <h2>AllTricks <small>- IT Solutions</small></h2><br/>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-3 control-label">Email</label>
    <div class="col-sm-6">
      <input type="email" class="form-control" id="inputEmail3" placeholder="Email" name="Email" style="width:250px;">
    </div>
  </div>
        <br/>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
    <div class="col-sm-6">
      <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="Password" style="width:250px;">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-6">
      <button type="submit" class="btn btn-default">Sign in</button>
      <a  href="Reg.jsp"><button type="button" value="reg.jsp" class="btn btn-default">Register</button></a>
    </div>
  </div>
</form>
</div>
   <%@include file="Footer.jsp" %>

<script src="js/jquery-2.1.4.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>