<%@page import="entidad.especialidad"%>
<%@page import="utils.MysqlDBConexion"%>
<%@page import="dao.DAOFactory"%>
<%@page import="entidad.sede"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.ModelDocente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html >
<head>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registrar Docentes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body style="background: yellow;">
	
<form style="margin-top:50px;margin-left:15%; width:60% ; background:orange ; padding: 80px;" method="post" action="ServletDocente">
<div style="text-align:center; font-size:20px; color:green; font-weight:bold ; font-family: fantasy;">
	<h1> REGISTRO DE DATOS DEL DOCENTE </h1>
</div>
  <div class="form-group">
    <label for="formGroupExampleInput">Codigo</label>
    <input type="text" class="form-control" disabled=""  id="formGroupExampleInput" placeholder="Codigo Autogenerado">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Nombres</label>
    <input type="text" class="form-control" name="txtNombreDocente" id="formGroupExampleInput2" placeholder="Ingrese Nombres">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Apellidos</label>
    <input type="text" class="form-control" name="txtApellidoDocente" id="formGroupExampleInput2" placeholder="Ingrese Apellidos">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">DNI</label>
    <input type="text" class="form-control" name="txtDNIDocente" id="formGroupExampleInput2" placeholder="Ingrese DNI">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Sueldo</label>
    <input type="text" class="form-control" name="txtSueldo" id="formGroupExampleInput2" placeholder="Ingrese Sueldo">
  </div>
  
  <div class="form-row" style="width: 610px;">
    <div class="form-group col-md-6">
      <label for="inputState">Sede</label>
      <select name="cboSede" class="form-control" style ="width : 208px">
				<%
                  //forma 1 de ralizar el listado del combo 
                  					DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                  					ArrayList<sede> lstSede = fabrica.getDocenteDAO().listarSedes();
                  					request.setAttribute("lstSede", lstSede);
                  
                  for( sede mar : lstSede) {
                	  
					%>
					
					<option value="<%=mar.getCod_sede()%>"><%=mar.getNom_sede()%></option>
					
					<%
					}
					%>
				</select>
    </div>
    
    
     <div class="form-group col-md-6" style="margin-left: -60px;">
      <label for="inputState">Especialidad</label>
				<td><select name="cboEspecialidad" class="form-control" style ="width : 208px">
				<%
                  //forma 1 de ralizar el listado del combo 
                  					DAOFactory fabrica2 = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
                  					ArrayList<especialidad> lstEspecialidades = fabrica2.getDocenteDAO().listarEspecialidades();
                  					request.setAttribute("lstEspecialidades", lstEspecialidades);
                  
                  for( especialidad mar : lstEspecialidades) {
                	  
					%>
					
					<option value="<%=mar.getCod_especialidad()%>"><%=mar.getNom_especialidad()%></option>
					
					<%
					}
					%>
				</select></td>
    </div>
    
    
    
    
    
    
    
    
    </div>
    
		
			
 <div style="margin-left:90px; margin-top: 20px">   
  <button style="width: 140px;" type="submit" name="accion" class="btn btn-primary" value="registrar">REGISTRAR</button>


  <button style="width: 140px;" type="submit"  name="accion" class="btn btn-primary" value="consultar">CONSULTAR</button>
  </div> 
    
</form>
 
${mensaje }
</body>
</html>