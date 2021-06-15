<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>What is the code?</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<p><c:out value="${error}"/></p>
		<form method="POST" action="processingForm">
			<label>What is the code?</label><br/>
			<input type="text" name="code"><br/>
			<button>Try Code</button>
		</form>
	</div>
</body>
</html>