
public class NodoZ {
	private NodoZ sig;
	private String zona;
	private LDobleA la;
	
	NodoZ()
	{
		sig=null;
		la=new LDobleA();
	}

	public NodoZ getSig() {
		return sig;
	}

	public void setSig(NodoZ sig) {
		this.sig = sig;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public LDobleA getLa() {
		return la;
	}

	public void setLa(LDobleA la) {
		this.la = la;
	}
	
	
	
	
	

}
