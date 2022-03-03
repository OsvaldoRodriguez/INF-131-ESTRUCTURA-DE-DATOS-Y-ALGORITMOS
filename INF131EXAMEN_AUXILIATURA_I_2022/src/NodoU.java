
public class NodoU {
	private Universidad u;
	private NodoU sig;
	
	NodoU(){
		u = new Universidad();
		sig = null;
	}
	public Universidad getU() {
		return u;
	}
	public void setU(Universidad u) {
		this.u = u;
	}
	public NodoU getSig() {
		return sig;
	}
	public void setSig(NodoU sig) {
		this.sig = sig;
	}
	
	
}
