<!DOCTYPE html>
<%@page import="model.Dado"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></link>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
<title>Gioco a dadi</title>
</head>

<body>

<%

	Dado dado1 = new Dado();
	Dado dado2 = new Dado();
	int vittorie = 0;
	
	if (session.getAttribute("punteggio") != null){
		vittorie = (int) session.getAttribute("punteggio");
	} else {
		session.setAttribute("punteggio", vittorie);
	}
	
	
	dado1.lancia();
	dado2.lancia();
	
	if (dado1.getFaccia() == dado2.getFaccia()){
		vittorie++; 
	}


	String img1 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f"+ dado1.getFaccia() +".jpg?raw=true";
	String img2 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f"+ dado2.getFaccia() +".jpg?raw=true";
	//String img3 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f3.jpg?raw=true";
	//String img4 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f4.jpg?raw=true";
	//String img5 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f5.jpg?raw=true";
	//String img6 ="https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f6.jpg?raw=true";

%>



<div class="row">
	<img class="img col-2" alt="dado1" src="<%=img1%>">
	<img class="img col-2" alt="dado2" src="<%=img2%>" >
	
</div>

<div class="row">
	<a class="btn btn-primary" href="?">Lancia dadi</a>
</div>

<div class="row">

<h2>Risultato <%=vittorie %></h2>

</div>




</body>
</html>