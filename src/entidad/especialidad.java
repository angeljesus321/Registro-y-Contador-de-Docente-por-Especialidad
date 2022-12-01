package entidad;

public class especialidad {
	
	int cod_especialidad;
	String nom_especialidad;
	
	

	@Override
	public String toString() {
		return "especialidad [cod_especialidad=" + cod_especialidad + ", nom_especialidad=" + nom_especialidad + "]";
	}

	public int getCod_especialidad() {
		return cod_especialidad;
	}

	public void setCod_especialidad(int cod_especialidad) {
		this.cod_especialidad = cod_especialidad;
	}

	public String getNom_especialidad() {
		return nom_especialidad;
	}

	public void setNom_especialidad(String nom_especialidad) {
		this.nom_especialidad = nom_especialidad;
	}
	
	
	
}
