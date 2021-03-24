<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Managerscreen.jsp" />
<h3>Customer Insurance Applications</h3>
<!-- <div id="myBtnContainer">
  <button onclick="window.location.href='viewHealthApplications.mvc'">Health</button>
   <button onclick="window.location.href='#life'">Life</button>
    <button onclick="window.location.href='#travel'">Vehicle</button>
     <button onclick="window.location.href='vehicle'">Travel</button>
</div> -->
 <b>Sort by:</b>  <button onclick="window.location.href='#Accepted'">Accepted</button>
 <button onclick="window.location.href='#Rejected'">Rejected</button>


 <b> Filter by:</b>  <button onclick="window.location.href='viewHealthApplications.mvc'">Health</button>
 <button onclick="window.location.href='#life'">Life</button>
 <button onclick="window.location.href='#Vehicle'">Vehicle</button>
 <button onclick="window.location.href='#Travel'">Travel</button>
 <!-- </div> -->
</body>
</html>