<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>


<hr>
<h1>Welcome to Saraye Automobile! Here is our new collection 2021 </h1>




<p>
	<table>
			<thead>
					<tr>
						<td><h4>Image</h4> </td>
						<td><h4>Year</h4> </td>
						<td><h4>Marque</h4> </td>
						<td><h4>Model</h4> </td>
					</tr>


			</thead>
			<tbody>
				<c:forEach items="${auto }" var="aut">
					<tr>
						<td><img src = "${aut.image }" height="200" width="150"/></td>
						<td>${aut.year }</td>
						<td>${aut.mark }</td>
						<td>${aut.model }</td>
						<td><a href="delete.do?id=${aut.id }">Delete</a></td>
						
					</tr>
				</c:forEach>
					
			</tbody>
	</table>
	
	<fieldset>
		<legend> Add a new car</legend>
			<form action="/car.do" method="post">	
				<input type="number" name="id" placeholder="Id">
				<input type="text" name="yr" placeholder="Year">
				<input type="text" name="mk" placeholder="Marque">
				<input type="text" name="md" placeholder="Modele">
				<input type="text" name="im" placeholder="Inserer le lien d'image ">
				<input type="submit" value ="Add car">	
			</form>	
	</fieldset>
	
	
</p>

<%@ include file="../common/footer.jspf" %>

