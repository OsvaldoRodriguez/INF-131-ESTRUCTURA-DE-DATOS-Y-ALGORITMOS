
public class NodoAE {
	private Estudiante e;
	private NodoAE izq, der;
	
	public NodoAE() {
		// TODO Auto-generated constructor stub
		izq = der = null;
		e = new Estudiante();
	}

	public Estudiante getE() {
		return e;
	}

	public void setE(Estudiante e) {
		this.e = e;
	}

	public NodoAE getIzq() {
		return izq;
	}

	public void setIzq(NodoAE izq) {
		this.izq = izq;
	}

	public NodoAE getDer() {
		return der;
	}

	public void setDer(NodoAE der) {
		this.der = der;
	}
	
	
}
