<%@page import="entidad.docente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DAOFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<meta charset="ISO-8859-1">
<title>Consulta Datos del Docente</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<body>
	<table class="table" style="width: 94%;margin-left:"10px;" margin-top: 20px;">
		<thead class="thead-dark">
			<tr>
				<th scope="col">CODIGO</th>
				<th scope="col">NOMBRES</th>
				<th scope="col">APELLIDOS</th>
				<th scope="col">DNI</th>
				<th scope="col">SUELDO</th>
				<th scope="col">SEDE</th>
				<th scope="col">ESPECIALIDAD</th>
			</tr>
		</thead>
		<tbody>
			<%
				DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
			ArrayList<docente> lstDocente = fabrica.getDocenteDAO().listarDocente();
			request.getAttribute("lstDocente");
			//recorre el listado
			for (docente doc : lstDocente) {
			%>
			<tr>
				<td style="text-align: center"><%=doc.getCod_docente()%></td>
				<td><%=doc.getNom_docente()%></td>
				<td><%=doc.getApe_docente()%></td>
				<td><%=doc.getDni_docente()%></td>
				<td><%=doc.getSueldo()%></td>
				<td><%=doc.getNombre_sede()%></td>
				<td><%=doc.getNombre_especialidad()%></td>
				

		

				

			

			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<div >
		<p> Cantidad de Docentes de Especialidades Ingenieria: ${cantidadDocentes}  </p>
	</div>
	<div >
		<p> Suma de Sueldos de Especialidad Ingenieria:${sueldo} </p>
	</div>
	
	<form action="ServletDocente" >
	  <button style="margin-left:37%;" value ="volver" type="submit"  name="accion" class="btn btn-primary" >REGISTRAR NUEVO DOCENTE</button>
	  </form>
	  ${mensaje }
</body>
</html>