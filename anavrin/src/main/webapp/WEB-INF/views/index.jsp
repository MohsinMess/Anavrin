<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="images" value="/resources/images" />
<spring:url var="js" value="/resources/js" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<html>
<head>

<script>
	window.contextRoot = '${contextRoot}';
</script>
<link href="${css}/mycss.css" rel="stylesheet">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- Jquery DataTable -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.css" />
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.js"></script>


</head>
<body>
	<div id="custom">
		<%@include file="navbar.jsp"%>

		<c:if test="${UserClickHome == true}">
			<%@include file="home.jsp"%>
		</c:if>

		<c:if test="${UserClickMen == true}">
			<%@include file="men.jsp"%>
		</c:if>

		<c:if test="${UserClickWomen == true}">
			<%@include file="women.jsp"%>
		</c:if>

		<c:if test="${UserClickKids == true}">
			<%@include file="kids.jsp"%>
		</c:if>

		<c:if test="${UserClickAddCategory == true}">
			<%@include file="Category.jsp"%>
		</c:if>

		<c:if test="${UserClickCategoryProducts == true}">
			<%@include file="categoryProducts.jsp"%>
		</c:if>
		
		<c:if test="${UserClickShowProduct == true}">
			<%@include file="singleProduct.jsp" %>
		</c:if>

		<script src="${js}/myapp.js"></script>
	</div>
</body>
</html>
