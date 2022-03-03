
public class NodoP {
	private String palabra;
	private NodoP izq,der;
	
	NodoP()
	{
		izq=der=null;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public NodoP getIzq() {
		return izq;
	}
	public void setIzq(NodoP izq) {
		this.izq = izq;
	}
	public NodoP getDer() {
		return der;
	}
	public void setDer(NodoP der) {
		this.der = der;
	}
	
	
}
