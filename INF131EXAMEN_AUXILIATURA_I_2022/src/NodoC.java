
public class NodoC {
	private Carrera c;
	private NodoC izq, der;
	
	NodoC(){
		izq = der = null;
		c = new Carrera();
	}

	public Carrera getC() {
		return c;
	}

	public void setC(Carrera c) {
		this.c = c;
	}

	public NodoC getIzq() {
		return izq;
	}

	public void setIzq(NodoC izq) {
		this.izq = izq;
	}

	public NodoC getDer() {
		return der;
	}

	public void setDer(NodoC der) {
		this.der = der;
	}
	
	
}
