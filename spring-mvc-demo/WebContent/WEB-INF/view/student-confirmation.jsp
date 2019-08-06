<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

	<title> Student confirmation form version 2 </title>

</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	
	<br><br>
	
	Country: ${student.selectedCountryValue}
	<!-- Country: ${student.selectedCountryValue} -->
	
	<br><br>
	
	Favorite language: ${student.favoriteLanguage}
	
	<br><br>
	
	Operating Systems: 
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		<li> ${temp} </li>
		</c:forEach>
	</ul>
	
	
</body>


</html>