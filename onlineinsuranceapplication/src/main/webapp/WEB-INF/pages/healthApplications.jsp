<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Manager</title>
</head>
<style>span {
  background-color: yellow;
}
</style>
<body>



<jsp:include page="customer_home.jsp" />
<div align="left">

	<h2>My Applications</h2>
	<table border="3" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Applied on</th>
			<th>Insurance Name</th>
			<th>Application Status</th>
		</tr>
		<c:forEach items="${listInsurance}" var="insurance">
			<tr>
				<td>${insurance.id}</td>
				<td>${insurance.fname}</td>
				<td>${insurance.lname}</td>
				<td>${insurance.age}</td>
				<td>${insurance.appliedon}</td>
				<td>${insurance.insurance_name}</td>
				<td><span>${insurance.status}</span></td>
<%-- 				<td>
<!-- 				<a href="/edit.mvc">Edit</a>
				&nbsp;&nbsp;&nbsp; -->
				<a href="delete/${insurance.id}.mvc"class="btn btn-danger">Delete</a>
				</td> --%>
			</tr>
		</c:forEach>
	</table>
	
	

</div>	

</body>

</html>