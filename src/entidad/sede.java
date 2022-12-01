package entidad;

public class sede {
	
	int cod_sede;
	String nom_sede;
	
	

	@Override
	public String toString() {
		return "sede [cod_sede=" + cod_sede + ", nom_sede=" + nom_sede + "]";
	}

	public int getCod_sede() {
		return cod_sede;
	}

	public void setCod_sede(int cod_sede) {
		this.cod_sede = cod_sede;
	}

	public String getNom_sede() {
		return nom_sede;
	}

	public void setNom_sede(String nom_sede) {
		this.nom_sede = nom_sede;
	}
	
	
}
