package interfaces;

import java.util.ArrayList;
import java.util.List;

import entidad.docente;
import entidad.especialidad;
import entidad.sede;

public interface interfacesDocentesDAO {
	
	public int registrarDocente (docente d);
	
	
	public ArrayList<sede> listarSedes();


	public ArrayList<especialidad> listarEspecialidades();
	
	public ArrayList<docente> listarDocente();
}
