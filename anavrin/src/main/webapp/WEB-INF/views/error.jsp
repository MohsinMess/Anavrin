<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<html>
<head>
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

	<nav class="navbar navbar-expand-sm navbar-custom">
		<a class="navbar-brand" href="${contextRoot}/home">Anavrin</a>
		<ul class="navbar-nav">

		</ul>
	</nav>
	
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>${errorHead}</h1>
				<hr/>
				<blockquote>
					${errorDescription}
				</blockquote>
			</div>
		</div>
	</div>

</body>
</html>
