
public class Estudiante {
	private String ap,nom;
	private int ci;
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public void leer() {
		ap = Leer.dato();
		nom = Leer.dato();
		ci = Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Estudiante [ap=" + ap + ", nom=" + nom + ", ci=" + ci + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
}
