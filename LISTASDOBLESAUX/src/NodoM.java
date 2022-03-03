
public class NodoM {
	private NodoM sig,ant;
	private Materia m;
	
	public NodoM() {
		sig = ant = null;
	}
	public NodoM getSig() {
		return sig;
	}
	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	public NodoM getAnt() {
		return ant;
	}
	public void setAnt(NodoM ant) {
		this.ant = ant;
	}
	public Materia getM() {
		return m;
	}
	public void setM(Materia m) {
		this.m = m;
	}
	
	
}
