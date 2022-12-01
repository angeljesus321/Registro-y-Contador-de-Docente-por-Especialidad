package dao;

import entidad.docente;

import modelo.ModelDocente;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public ModelDocente getDocenteDAO() {
		
		return new ModelDocente();
	}

}
