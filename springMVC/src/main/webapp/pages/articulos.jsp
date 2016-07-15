<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Articulos</title>
<style>
.error {
	color: #ff0000;
}

</style>
</head>
<body>
   <hr/>
	<form:form method="post"  action="agregarArticulo" commandName="articulo">

		<table>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" /></td>
				<td><form:errors path="nombre" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="precio">Precio</form:label></td>
				<td><form:input path="precio" /></td>
				<td><form:errors path="precio" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="cantidad">Cantidad</form:label></td>
				<td><form:input path="cantidad" /></td>
				<td><form:errors path="cantidad" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="agregar articulos" /></td>
			</tr>
		</table>

	</form:form>
	    
	    <table border="1">
	    	<tr>
	           <td>Nombre</td>
	           <td>Precio</td> 	
	           <td>Cantidad</td> 
	    	</tr>
		   <c:forEach items="${articulos}" var="articulo">
		         <tr>
			        <td><c:out value="${articulo.nombre}"/></td>
			        <td><c:out value="${articulo.precio}"/></td>
			        <td><c:out value="${articulo.cantidad}"/></td>
			     </tr>    
			</c:forEach>
        </table>
</body>
</html>