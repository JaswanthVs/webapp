<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Manager</title>

<style>
h1 {
  background-color: green;
}

span {
  background-color: lightgreen;
}</style>
<style>span1 {
  background-color: tomato;
}</style>
</head>

<body>
<jsp:include page="Managerscreen.jsp" />
<jsp:include page="applicationbuttons.jsp"></jsp:include>
	<h2>Health Insurance Applications</h2>
	<table border="3" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Insurance Type</th>
			<th>Applied on</th>
			<th>Application Status</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${listInsurance}" var="insurance">
			<tr>
				<td>${insurance.id}</td>
				<td>${insurance.fname}</td>
				<td>${insurance.lname}</td>
				<td>${insurance.age}</td>
				<td>${insurance.insurance_name}</td>
				<td>${insurance.appliedon}</td>
				<td>${insurance.status}</td>
				<td>
				<a href="accept/${insurance.id}.mvc"><span><b>Approve</b></span></a>
				&nbsp;&nbsp;&nbsp;
				<a href="reject/${insurance.id}.mvc"><b>Reject</b></a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	

</body>

</html>