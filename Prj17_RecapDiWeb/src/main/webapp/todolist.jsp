<%@page import="java.util.ArrayList"%>
<%
	String richiestaUtente = null;
	ArrayList<String> lista = null;
	
	if(request.getParameter("svuotatore") !=null){
		session.setAttribute("listaCose", null);
		
	}
	
	
	
	
	//out.print(request.getParameter("cosaDaInserire"));
	//verifico se l'arraList esiste
	if (session.getAttribute("listaCose") != null){
		out.println("sessione già esistente");
		lista = (ArrayList<String>)session.getAttribute("listaCose");
	}
	else{
		lista = new ArrayList<>();
		out.println("sessione NON esistente");
		session.setAttribute("listaCose", lista);
	}
	
	
	
if (request.getAttribute("cosaDaInserire") !=null && !request.getParameter("cosaDaInserire").trim().equals("")){
	richiestaUtente = (String) request.getParameter("cosaDaInserire");
	lista.add(richiestaUtente.trim()); //aggiungi la nota all'al
}

%>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Todolist</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></link>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</head>
<body>


	
	<form action="" method="post">
	
		<input class="form-control" type="text" name="cosaDaInserire" placebeold="scrivi qui la tua">
	<br>
		<input class="btn btn-primary" type="submit" value="Aggiungi nota">
	
	</form>
	
	<form action="" method="post">
		<input class="btn btn-danger" name="svuotatore" type="submit" value="svuota lista">
	</form>
	
	<ul>
		<% for (String nota : lista){ %>
			<li> <%=nota %></li>
		<%} %>
	</ul>
	
	

</body>
</html>