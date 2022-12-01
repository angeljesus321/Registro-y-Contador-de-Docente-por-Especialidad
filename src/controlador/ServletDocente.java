package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.docente;
import modelo.ModelDocente;

/**
 * Servlet implementation class ServletDocente
 */
@WebServlet("/ServletDocente")
public class ServletDocente extends HttpServlet {
	ModelDocente d = new ModelDocente();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDocente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		switch (accion) {
		case "registrar":
			registrar(request, response);
			break;
      case "consultar":
    	  consultar(request, response);
			break;
      case "volver":
    	  volver(request, response);
			break;
		default:
			break;
		}
		/*
			if (tipo.equals("registrar"))
			registrar(request, response);
			else if (tipo.equals("consultar"))
				consultar(request, response);*/
		
	}

	private void volver(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.getRequestDispatcher("RegistroDocente.jsp").forward(request, response);
	}

	private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.getRequestDispatcher("ConsultaDatosDocente.jsp").forward(request, response);
	}


	protected void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		docente obj = new docente();
		String nombre_docente = request.getParameter("txtNombreDocente");
		String apellido_docente = request.getParameter("txtApellidoDocente");
		int dni_docente = Integer.parseInt(request.getParameter("txtDNIDocente"));
		double sueldo_docente = Double.parseDouble(request.getParameter("txtSueldo"));
		int cod_sede = Integer.parseInt(request.getParameter("cboSede"));
		int cod_especialidad = Integer.parseInt(request.getParameter("cboEspecialidad"));
		
	
		int cantidadDocente = (int) request.getSession().getAttribute("cantidadDocentes");
		double sueldo = (double) request.getSession().getAttribute("sueldo");
	
		
		if (cod_especialidad == 1 ) {
			cantidadDocente += 1;
			sueldo += sueldo_docente;

		}
		  
		

		obj.setNom_docente(nombre_docente);
		obj.setApe_docente(apellido_docente);
		obj.setDni_docente(dni_docente);
		obj.setSueldo(sueldo_docente);
		obj.setCod_sede(cod_sede);
		obj.setCod_especialidad(cod_especialidad);
		
		int estado = d.registrarDocente(obj);
		
	
		
		if (estado == 0) {
			request.setAttribute("mensaje","<script>swal({icon: 'error',title: 'Ups...', text: '¡Error al Registrar!',});</script>");
			request.getRequestDispatcher("RegistroDocente.jsp").forward(request, response);
		}else {
			
			request.setAttribute("mensaje","<script>swal('Mensaje!','Docente Registrado', 'success');</script>");
			
			request.getSession().setAttribute("cantidadDocentes",  cantidadDocente);
			request.getSession().setAttribute("sueldo", sueldo);
		
			request.getRequestDispatcher("ConsultaDatosDocente.jsp").forward(request, response);
			
		
			
		}

	
	
	}}
