package dao;


import modelo.ModelDocente;


public abstract class DAOFactory {

	//Posibles origenes de datos
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	public static final int DB2 = 3;
	public static final int SQLSERVER = 4;
	public static final int XML = 5;
	
	public abstract ModelDocente getDocenteDAO();
	
	public static DAOFactory getDAOFactory(int whichFactory) {
		switch (whichFactory) {
		case MYSQL :
			return new MySqlDAOFactory();
		}
		return null;
	}
		
	
}
