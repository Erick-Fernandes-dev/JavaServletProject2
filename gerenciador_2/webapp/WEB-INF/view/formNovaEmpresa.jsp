<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"></c:url>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<form action="${ linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome" />
		Data Abertura: <input type="text" name="data">
		
		<input type="hidden" name="acao" value="NovaEmpresa">
	
		<input type="submit" />	
	
	</form> 

</body>
</html>  