<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>


<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="content-language" content="pl"/>


<title>Organizer Ślubny - lista gości</title>

Organizer Ślubny - lista gości
</head>



<body>



<input type="button" value="Dodaj goscia"
	onclick="window.location.href='showFormForAdd'; return false;" class="add-button">
<table>
	<tr>
		<th>imię</th>
		<th>nazwisko</th>
		<th>przyjezdny</th>
		<th>status obecnosci</th>
		<th>potrzebny nocleg</th>
		<th>dzieci</th>
		<th>Aktualizuj</th>
	</tr>
	
	<c:forEach var="tempGuest" items="${guests}">
		<c:url var="updateLink" value="/guest/showFormForUpdate">
		<c:param name="guestId" value="${tempGuest.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/guest/showFormForDelete">
		<c:param name="guestId" value="${tempGuest.id}"></c:param>
		 </c:url>
		
	
		
	
	<tr>
		<td>${tempGuest.imie}</td>
		<td>${tempGuest.nazwisko}</td>
		<td>${tempGuest.przyjezdny}</td>
		<td>${tempGuest.statusObecnosci}</td>
		<td>${tempGuest.potrzebnyNocleg}</td>
		<td>${tempGuest.dzieci}</td>
			<td>
				<a href="${updateLink}">Aktualizuj</a>
			</td>
			<td>
			<a href="${deleteLink}">Delete</a>
			</td>
	</tr>
	

	
	
	
	</c:forEach>
	





</table>






</body>







</html>