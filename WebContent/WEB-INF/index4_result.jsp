<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<ul>
		<c:forEach var="book" items="${listOfBooks}"> 
			<li>${book.getAuthor()} ${book.getTitle()}</li>
	  	</c:forEach>
	</ul>
</body>
</html>