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

<!-- Code Assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>

</head>
<body>
<h1>City Page pageNo=${page.paging.pageNo}</h1>
<ol class="list-group">
	<c:forEach var="dept" items="${page.list}">
		<li class="list-group-item-info animated zoomIn">${dept.deptno}, <a href="/dept/item/${dept.deptno}?pageNo=${page.paging.pageNo}">${dept.dname}</a>, ${dept.loc}</li>
	</c:forEach>
</ol>
<hr class="animated bounce">

<a href="/dept/page/1">First</a>
<a href="/dept/page/${page.paging.firstPage - 1}">Prev</a>
<c:forEach var="i" begin="${page.paging.firstPage}" end="${page.paging.lastPage}">
	<a href="/dept/page/${i}">${i}</a>
</c:forEach>
<a href="/dept/page/${page.paging.lastPage + 1}">Next</a>
<a href="/dept/page/${page.paging.totalPage}">Last</a>






</body>
</html>