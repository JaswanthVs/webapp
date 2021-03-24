<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Insurance</title>
</head>
<body>
<jsp:include page="customer_home.jsp" />
	<div align="center">
		<h2>Family Floater Form</h2>
		<form:form action="appliedSuccessfully.mvc" method="post" modelAttribute="health">
            <table border="0" cellpadding="5">
                <tr>
                    <td>First Name</td>
                    <td><form:input path="fname" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><form:input path="lname" /></td>
                </tr>   
                <tr>
                                <tr>
                    <td>Age</td>
                    <td><form:input path="age" /></td>
                </tr>
                <tr>
                    <td>Occupation</td>
                    <td><form:input path="occupation" /></td>
                </tr>   
                <tr>
                                <tr>
                    <td>State</td>
                    <td><form:input path="state" /></td>
                </tr>
 
                                 <tr>
                    <td>Aadhar Card Number</td>
                    <td><form:input path="adharnumber" /></td>
                </tr>
                                                <tr>
                    <td>Cibil Score</td>
                    <td><form:input path="state" /></td>
                </tr>
           
                 <tr>
                    <td>Father Name: </td>
                    <td><form:input path="state" /></td>
                </tr>
                                 <tr>
                    <td>Age: </td>
                    <td><form:input path="state" /></td>
                </tr>
                <tr>
                    <td>Mother Name: </td>
                    <td><form:input path="state" /></td>
                </tr>
                                 <tr>
                    <td>Age: </td>
                    <td><form:input path="state" /></td>
                </tr>

                
                
                
                
                <tr>
                    <td colspan="2"><input type="submit" value="Apply"></td>
                </tr>                    
            </table>
        </form:form>
	</div>


	

</body>
</html>