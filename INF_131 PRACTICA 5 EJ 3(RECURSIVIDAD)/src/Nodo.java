
public class Nodo {
	private Nodo sig;
	private String disciplina,deportista,medalla,pais;

	Nodo()
	{
		sig=null;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getDeportista() {
		return deportista;
	}

	public void setDeportista(String deportista) {
		this.deportista = deportista;
	}

	public String getMedalla() {
		return medalla;
	}

	public void setMedalla(String medalla) {
		this.medalla = medalla;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}



}
