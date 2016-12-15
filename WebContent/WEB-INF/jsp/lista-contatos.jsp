<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,
			br.com.caelum.mvc.dao.*,
			br.com.caelum.mvc.modelo.*"  %>         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listando Contatos</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
</head>
<body>
	
	<table>
		<tr>
			<td></td>
		</tr>
		<c:forEach var="contato" items="${contatos}"></c:forEach>
			<tr>
				<td>${contato.nome}</td>
			  	<td>
			      <c:if test="${not empty contato.email}">
			        <a href="mailto:${contato.email}">${contato.email}</a>
			      </c:if>
			      	<c:if test="${empty contato.email}">
        				E-mail não informado
      				</c:if>
			    </td>
				<td>${contato.endereco}</td>
				<td>
					<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remove</a>
				</td>
			</tr>
	</table>
</body>
</html>