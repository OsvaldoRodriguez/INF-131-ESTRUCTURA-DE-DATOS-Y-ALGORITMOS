
public class Nodo {
	
	private int nro;
	private Nodo izq,der;
	Nodo()
	{
		izq=null;
		der=null;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Nodo getIzq() {
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	public Nodo getDer() {
		return der;
	}
	public void setDer(Nodo der) {
		this.der = der;
	}
	
	
}
