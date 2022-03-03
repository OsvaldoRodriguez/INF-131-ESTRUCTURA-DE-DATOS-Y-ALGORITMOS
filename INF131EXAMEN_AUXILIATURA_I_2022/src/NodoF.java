
public class NodoF {
	private Facultad f;
	private NodoF sig;
	
	NodoF(){
		f = new Facultad();
		sig = null;
	}
	
	public Facultad getF() {
		return f;
	}
	public void setF(Facultad f) {
		this.f = f;
	}
	public NodoF getSig() {
		return sig;
	}
	public void setSig(NodoF sig) {
		this.sig = sig;
	}
	
	
}
