
public class NodoLD {
	private NodoLD sig, ant;
	private Estudiante e;
	
	NodoLD(){
		sig = ant = null;
	}

	public NodoLD getSig() {
		return sig;
	}

	public void setSig(NodoLD sig) {
		this.sig = sig;
	}

	public NodoLD getAnt() {
		return ant;
	}

	public void setAnt(NodoLD ant) {
		this.ant = ant;
	}

	public Estudiante getE() {
		return e;
	}

	public void setE(Estudiante e) {
		this.e = e;
	}
	
	
}
