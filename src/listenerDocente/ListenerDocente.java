package listenerDocente;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ListenerDocente
 *
 */
@WebListener
public class ListenerDocente implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public ListenerDocente() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("Id de sesion :" +  arg0.getSession().getId());
         /*
         <div >
 		<p> Cantidad de Docentes de Especialidades Ingenieria: </p>
 	</div>
 	<div >
 		<p> Suma de Sueldos de Especialidad Ingenieria: </p>
 	</div>*/
         
        int cantidadDocentes = 0 ;
         double sueldo = 0;
         
       
     	
     	arg0.getSession().setAttribute("cantidadDocentes", cantidadDocentes);
     	arg0.getSession().setAttribute("sueldo", sueldo);
     
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
