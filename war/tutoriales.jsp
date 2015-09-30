<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="persistence.Tutorial"%>
<%@ page import="persistence.TutorialUtils"%>
<%@ page import="java.util.List"%>

<html>
<head>
	<title>Red Social UPTC</title>
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>

	<div id="header">
		<img id="foto" src="img/fotoPerfil.jpg"></img>
	</div>
	
	<div id="listado">
		<h2>Ultimas 10 Publicaciones</h2>
			<%
				List<Tutorial> tutoriales = TutorialUtils.getEntries();
				if (tutoriales.isEmpty()) {
			%>
				No hay ningúna publicacion hasta el momento
			<%
				} 
				else {
					%>
					<hr id="linea" size="10" />
					<% 
					for (Tutorial tutorial : tutoriales) {
			%>	
				<p>- '<%=tutorial.getTutorial()%>' de <i><%=tutorial.getAutor()%></i>, publicado el <%=tutorial.getFecha()%></p>
				<hr size="10" />
			<%
					}
				}
			%>
	</div>
	
	<div id="publicar">
		<h2>Nueva Publicacion</h2>
		<form action="/tutoriales" method="post">
			<p>- Contenido a publicar: <input name="tutorial" class="login-input"></p>
			<p>- Autor: <input name="autor" class="login-input"></p>
			<p><input id="boton" type="submit" value="Publicar"></p>
		</form>
	</div>
</body>
</html>
