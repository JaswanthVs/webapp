<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <html>
<body>
${ message}


</body>
</html> --%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>

<div class="header">
  <a href="#default" class="logo">Manager Module</a>
  <div class="header-right">
    <a class="active" href="manager.mvc">Home</a>
<!--         <a href="insurances.mvc">Add Insurance</a> -->
    <a href="viewApplications.mvc">Applications</a>
<!--     <a href="#about">Claim ReimburseApps</a> -->
       <a href="">Log out</a>
  </div>
</div>
<!-- /insuranceapplication/logout.mvc -->
 

<div style="padding-left:20px">


</div>

</body>
</html>