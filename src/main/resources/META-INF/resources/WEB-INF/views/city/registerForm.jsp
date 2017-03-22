<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerForm.jsp</title>
<!-- Code Assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>

</head>
<body>
<h1>city 등록</h1>
<form:form action="/city/register" method="post" modelAttribute="cityForm">
	
	<!-- Name -->
	<div>
		<label for="name">Name:</label>
		<form:input path="name"/>
		<form:errors path="name"/>
	</div>

	
	<!-- CountryCode -->
	<div>
		<label for="countryCode">CountryCode:</label>
		<form:input path="countryCode"/>
		<form:errors path="countryCode"/>
	</div>


	<!-- district -->
	<div>
		<label for="district">district:</label>
		<form:input path="district"/>
		<form:errors path="district"/>
	</div>


	<!-- population -->
	<div>
		<label for="population">population:</label>
		<form:input path="population"/>
		<form:errors path="population"/>
	</div>

	<input type="submit" value="city등록">
</form:form>
</body>
</html>