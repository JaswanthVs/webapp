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

<body>
<jsp:include page="Managerscreen.jsp" />
<div align="left">

	<h3><a href="/insuranceapplication/newinsurance.mvc">Add New Insurance</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Insurance Type</th>
			<th>Policy Name</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${listInsurance}" var="insurance">
			<tr>
				<td>${insurance.id}</td>
				<td>${insurance.insurance_name}</td>
				<td>${insurance.policy}</td>
				<td>
<!-- 				<a href="/edit.mvc">Edit</a>
				&nbsp;&nbsp;&nbsp; -->
				<a href="delete/${insurance.id}.mvc"class="btn btn-danger">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	

</div>	

</body>
</html>