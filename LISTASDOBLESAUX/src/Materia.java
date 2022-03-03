
public class Materia {
	private String sigla,doc,tipo;
	private int semestre;
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void leer() {
		sigla = Leer.dato();
		doc = Leer.dato();
		tipo = Leer.dato();
		semestre = Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Materia [sigla=" + sigla + ", doc=" + doc + ", tipo=" + tipo + ", semestre=" + semestre + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
