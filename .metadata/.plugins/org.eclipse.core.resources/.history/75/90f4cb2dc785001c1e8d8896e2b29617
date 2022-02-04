<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List,br.com.alura.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="mostra"></c:url>
<c:url value="/entrada" var="remove"></c:url>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>

	<c:if test="${ not empty empresa }">
	
		Empresa ${ empresa } cadastrada com sucesso!
	
	</c:if>
	

	Lista de empresas: <br />
	
	<ul>
	
		<c:forEach items="${empresas}" var="empresa">
		
			<li>
				${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }"
				pattern="dd/MM/yyyy"/>
				
				<a href="${mostra}?acao=MostraEmpresa&id=${empresa.id}">edita</a>
				<a href="${remove}?acao=RemoveEmpresa&id=${empresa.id}">remove</a>
			
			</li>
		
		</c:forEach>
	
	
	
	</ul>

</body>
</html>