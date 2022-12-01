package entidad;

public class docente {
	
	private int cod_docente;
	private String nom_docente;
	private String ape_docente;
	private int dni_docente;
	private double sueldo;
	private int cod_sede;
	private int cod_especialidad;
	
	private String nombre_sede;
	private String nombre_especialidad;
	
	@Override
	public String toString() {
		return "docente [cod_docente=" + cod_docente + ", nom_docente=" + nom_docente + ", ape_docente=" + ape_docente
				+ ", dni_docente=" + dni_docente + ", sueldo=" + sueldo + ", cod_sede=" + cod_sede
				+ ", cod_especialidad=" + cod_especialidad + ", nombre_sede=" + nombre_sede + ", nombre_especialidad="
				+ nombre_especialidad + "]";
	}

	public int getCod_docente() {
		return cod_docente;
	}

	public void setCod_docente(int cod_docente) {
		this.cod_docente = cod_docente;
	}

	public String getNom_docente() {
		return nom_docente;
	}

	public void setNom_docente(String nom_docente) {
		this.nom_docente = nom_docente;
	}

	public String getApe_docente() {
		return ape_docente;
	}

	public void setApe_docente(String ape_docente) {
		this.ape_docente = ape_docente;
	}

	public int getDni_docente() {
		return dni_docente;
	}

	public void setDni_docente(int dni_docente) {
		this.dni_docente = dni_docente;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getCod_sede() {
		return cod_sede;
	}

	public void setCod_sede(int cod_sede) {
		this.cod_sede = cod_sede;
	}

	public int getCod_especialidad() {
		return cod_especialidad;
	}

	public void setCod_especialidad(int cod_especialidad) {
		this.cod_especialidad = cod_especialidad;
	}

	public String getNombre_sede() {
		return nombre_sede;
	}

	public void setNombre_sede(String nombre_sede) {
		this.nombre_sede = nombre_sede;
	}

	public String getNombre_especialidad() {
		return nombre_especialidad;
	}

	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
	

	
	
	
}
