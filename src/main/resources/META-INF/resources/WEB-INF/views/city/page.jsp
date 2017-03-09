<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page.jsp</title>
<!-- 1. animate -->
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.min.css">
<!-- 2. bootstrap -->
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
<!-- 3. jquery -->
<script type="text/javascript" src="/webjars/jquery/1.11.1/jquery.min.js"></script>
<!-- 4. bootstrap.js -->
<script type="text/javascript" src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

<!-- Code Assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>

</head>
<body>
<h1>City Page pageNo=${page.paging.pageNo}</h1>
<ol class="list-group">
	<c:forEach var="city" items="${page.citys}">
		<li class="list-group-item-info animated zoomIn">${city.id}, <a href="/city/item/${city.id}?pageNo=${page.paging.pageNo}">${city.name}</a>, ${city.population} ${city.countryCode}</li>
	</c:forEach>
</ol>
<hr class="animated bounce">

<a href="/city/page/1">First</a>
<a href="/city/page/${page.paging.firstPage - 1}">Prev</a>
<c:forEach var="i" begin="${page.paging.firstPage}" end="${page.paging.lastPage }">
	<a href="/city/page/${i}">${i}</a>
</c:forEach>
<a href="/city/page/${page.paging.lastPage + 1}">Next</a>
<a href="/city/page/${page.paging.totalPage}">Last</a>






</body>
</html>