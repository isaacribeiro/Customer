<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Create Customer</title>
</head>
<body>
	<h1>List of reservations</h1>
	<c:if test="${success}">
		<fmt:message key="customerAddedSuccessfully" />
	</c:if>
	<table>
		<tr>
			<th>Name</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.name}</td></tr>
		</c:forEach>
	</table>
	<br>
	<a href="addNewCustomer">Add New Customer</a>
</body>
</html>
