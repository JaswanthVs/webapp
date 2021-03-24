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
<jsp:include page="Managerscreen.jsp" />
	<div align="center">
		<h2>New Insurance</h2>
		<form:form action="save.mvc" method="post" modelAttribute="insurance">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Insurance Type </td>
                    <td><form:input path="insurance_name" /></td>
                </tr>
                <tr>
                    <td>Policy Name </td>
                    <td><form:input path="policy" /></td>
                </tr>   
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
	</div>


	

</body>
</html>