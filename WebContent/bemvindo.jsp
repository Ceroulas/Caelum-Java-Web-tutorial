<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem vindo!</title>
</head>
<body>
<%-- comentário em JSP: nossa primeira JSP --%>
<%
	String mensagem = "Bem vindo ao sistema da agenda!";
%>
<% out.println(mensagem); %>
<br />
<%
	String desenvolvido = "Desenvolvido por Jonathan.";
%>
<%=desenvolvido%>
<br />
<%
	System.out.println("Tudo foi executado!");
%>
<br />
</body>
</html>