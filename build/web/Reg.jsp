<%-- 
    Document   : Reg
    Created on : Sep 23, 2016, 7:20:01 PM
    Author     : Parth Makadiya
--%>
<!docktype html>
<html>
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" >
	<link rel="stylesheet" href="css/bootstrap.min.css"><!-   https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap-theme.css->
	<title>Trying Bootstrap</title>
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
        <form action="DB" method="post">
        <h2>AllTricks <small>- Register Here </small></h2><br/>
   
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-3 control-label">Email</label>
    <div class="col-sm-6">
        <input type="email" class="form-control" id="inputEmail3" placeholder="Email" name="Email"  style="width:250px;">
    </div>
  </div>
        <br/>
         <div class="form-group">
    <label for="" class="col-sm-3 control-label">Full Name</label>
    <div class="col-sm-6">
        <input type="text" class="form-control" id="" placeholder="Full Name(Name+Surname)" name="Name" style="width:250px;">
    </div>
  </div>
        <br/>
         <div class="form-group">
    <label for="" class="col-sm-3 control-label">Date Of Birth</label>
    <div class="col-sm-6">
        <input type="date" class="form-control" name="DOB" style="width:250px;">
    </div>
  </div>
        <br/>
     
        <div class="form-group">
    <label for="" class="col-sm-3 control-label">Nationality</label>
    <div class="col-sm-6">        
        <select class="form-control" id="sel1" name="Country" style="width:250px;">
    <option>India</option>
    <option>USA</option>
    <option>China</option>
    <option>Russia</option>
    <option>Bangla</option>
    <option>Nepal</option>
    <option>UK</option>
    <option>Germeny</option>
    <option>Brazil</option>
    <option>Pakistan</option>
    <option>other</option>
  </select>
    </div>
  </div>
        <br/>
    <div class="form-group">
    <label for="inputPhone" class="col-sm-3 control-label">Cell no.</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="inputCellno" placeholder="Phone" name="Phone" style="width:250px;">
    </div>
  </div>
        <br/>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-3 control-label">Password</label>
    <div class="col-sm-6">
      <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="pwd" style="width:250px;">
    </div>
  </div>
        <br/>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-3 control-label">Confirm Password</label>
    <div class="col-sm-6">
        <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="cpwd" style="width:250px;">
    </div>
  </div>      
  
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-6">
        <a href="index.jsp"><button type="button" class="btn btn-default">Sign in</button></a>
        <button type="submit" value="reg" class="btn btn-default">Register</button>
    </div>
  </div>
        </form>
</div>
   <%@include file="Footer.jsp" %>

<script src="js/jquery-2.1.4.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>