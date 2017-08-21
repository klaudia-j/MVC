<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <% String[] animals = {"Pies", "Kot", "Nietoperz", "Ważka", "Słoń", "Mysz", "Szczur", "Kangur", "Pelikan"}; %> --%> 
<html>
<body>
	<ul>
		<c:forEach var="animal" items="${animals}"> 
			<li> Ania ma ${animal}</li>
	  	</c:forEach>
	</ul>
</body>
</html>