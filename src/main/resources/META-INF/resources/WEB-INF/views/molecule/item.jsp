<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>item.jsp</title>

</head>
<body>
${error}<br>


<div class="container">
       <h3>Mass Info</h3>
  <table style="width:400px" class="table table-condensed">
    <thead>
      <tr>
        <th>name</th>
        <th>chemical formula</th>
        <th>mass</th>

      </tr>
    </thead>
    <tbody>
    
      <tr>
        <td>${molecule.name}</td>
        <td>${molecule.chemicalFormula}</td>
        <td style="color:red">${molecule.mass.molarMass}</td>
    
       
      </tr>
    
    </tbody>
  </table>
</div>


</body>
</html>