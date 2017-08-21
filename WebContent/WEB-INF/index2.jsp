<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<c:forEach var="number" begin="${start}" end="${end}">
		<p>
			<c:out value="${number}" />
		</p>
	</c:forEach>
</body>
</html>