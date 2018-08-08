<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="content-language" content="pl"/>
	<title>Dodawanie goscia</title>
	
	
</head>


<body>



		<h2>Dodawanie gościa</h2>
		
	

	<h3>Save Customer</h3>
	
	<form:form action="saveGuest" modelAttribute="guest" method="post">
	<form:hidden path="id"/>
	
	<table>
		<tbody>
			<tr>
				<td><label>Imie:</label></td>
				<td><form:input path="imie"/></td>
			</tr>
				<tr>
				<td>
				<label>Nazwisko:</label></td>
				<td><form:input path="nazwisko"/></td>
			</tr>
				<tr>
				<td><label>Przyjezdny:</label></td>
				<td><select name="przyjezdny" >
				<option value="Tak">Tak</option>
				<option value="Nie">Nie</option>
				</select></td>
				
			</tr>
			
			<tr>
				<td><label>Status obecnosci:</label></td>
				<td><select name="statusObecnosci">
				<option value="Brak potwierdzenia">Brak potwierdzenia</option>
				<option value="Potwierdzone">Potwierdzone</option>
				<option value="Odmowione">Odmowione</option>
				</select></td>
			</tr>
			
			<tr>
				<td><label>Potrzebny nocleg:</label></td>
				<td><select name="potrzebnyNocleg" >
				<option value="Tak">Tak</option>
				<option value="Nie">Nie</option>
				</select></td>
				
			</tr>
			
			<tr>
				<td><label>Przyjedziesz z dziecmi?:</label></td>
				<td><select name="dzieci" >
				<option value="Tak">Tak</option>
				<option value="Nie">Nie</option>
				</select></td>
				
			</tr>
				<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save"/></td>
			</tr>
		
		</tbody>
	
	</table>
	
	</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/guest/list">Back to List</a>
		</p>
	
	
	


</body>
</html>