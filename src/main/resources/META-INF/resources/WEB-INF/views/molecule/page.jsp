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

<!-- code_assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>

</head>
<body>
<c:set var="molecules" 	value="${page.molecules}"/>
<c:set var="paging" 	value="${page.paging}"/>


<div class="container">
  <h3>Organic Molecules</h3> pageNo = ${paging.pageNo}
  <a href="/molecule/register" class="btn btn-primary">register</a>
         
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>No</th>
        <th>name</th>
        <th>chemical formula</th>
        <th>density</th>
        <th>average melting point</th>
        <th>solubility in water</th>
        <th>acidity</th>
        <th>hazard statements</th>
        <th>note</th>
        
      </tr>
    </thead>
    <tbody>
    <c:forEach var="m" items="${molecules}" varStatus="status">
      <tr>
        <td>${status.index+1}</td>
        <td>${m.name}</td>
        <td><a href="/molecule/item/${m.chemicalFormula}">${m.chemicalFormula}</a> </td>
        <td>${m.density}</td>
        <td><a href="/molecule/item1/${m.averageMeltingPoint}">${m.averageMeltingPoint}</a></td>
        <td>${m.solubilityInWater}</td>
        <td><a href="/molecule/item2/${m.acidity}">${m.acidity}</a></td>
        <td><a href="/molecule/item3/${m.hazardStatements}">${m.hazardStatements} </a></td>
        <td>${m.note}</td>
        
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<hr>
<!-- <button onclick="displayBox(event)" class="btn btn-danger animated bounce"> -->
<%-- ${paging} --%>
<!-- </button> -->
<hr>
<div align="center">
<a href="/molecule/page/${paging.firstPage - 1}">Prev</a>
<c:forEach var="i" begin="${paging.firstPage}" end="${paging.lastPage}">
	<a href="/molecule/page/${i}">${i}</a>
</c:forEach>
<a href="/molecule/page/${paging.lastPage + 1}">Next</a>
</div>
<script type="text/javascript">
	function displayBox(event) {
		$('.btn').toggleClass('btn-danger');
	}
</script>

</body>
</html>