<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href='<c:url value="./resources/css/teste.css" />'>
<title>Consulta Grupo</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp" />
	</div>
	<br />
	<div align="center" class="container">
		<form action="consultagrupo" method="post">
			<p class="title">
				<b>Consulta Grupo</b>
			</p>
			<table>
					<tr>
						<th><input type="text" id="grupo" 
						name="grupo" placeholder="Nome do Grupo"></th>
						
						<th><input type="submit" id="botao" 
						name="botao" value="Pesquisar"></th>
					</tr>
			</table>
		</form>
	</div>
	<br />
	<br />
	<div align="center">
		<c:if test="${not empty erro } ">
			<H2><c:out value="${erro }"  /></H2>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty saida } ">
			<H3><c:out value="${saida }"  /></H3>
		</c:if>
	</div>
	<br />
	<br />
	<div align="center" class="container">
		<table>
			<thead>
				<tr>
					<th><b>Time</b></th>
					<th><b>numJogos</b></th>
					<th><b>Vitórias</b></th>
					<th><b>Empates</b></th>
					<th><b>Derrotas</b></th>
					<th><b>Gols_Marcados</b></th>
					<th><b>Gols_Sofridos</b></th>
					<th><b>Saldo_Gols</b></th>
					<th><b>Pontos</b></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${jogosInf }" var="jf">
					<tr>
						<td><c:out value="${jf.Time }"></c:out></td>
						<td><c:out value="${jf.numJogos }"></c:out></td>
						<td><c:out value="${jf.Vitorias }"></c:out></td>
						<td><c:out value="${jf.Empates }"></c:out></td>
						<td><c:out value="${jf.Derrotas }"></c:out></td>
						<td><c:out value="${jf.Gols_Marcados }"></c:out></td>
						<td><c:out value="${jf.Gols_Sofridos }"></c:out></td>
						<td><c:out value="${jf.Saldo_Gols }"></c:out></td>
						<td><c:out value="${jf.Pontos }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>