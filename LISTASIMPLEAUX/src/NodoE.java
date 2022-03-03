
public class NodoE {
	private NodoE sig;
	private Estudiante e;

	public Estudiante getE() {
		return e;
	}

	public void setE(Estudiante e) {
		this.e = e;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	public NodoE() {
		sig = null;
	}
	
}
