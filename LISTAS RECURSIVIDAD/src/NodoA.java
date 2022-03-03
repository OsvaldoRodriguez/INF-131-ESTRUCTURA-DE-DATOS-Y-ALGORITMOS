
public class NodoA {
	
	private Arbol a;
	private NodoA ant,sig;
	
	NodoA()
	{
		ant=sig=null;
		a=new Arbol();//importante
	}

	public Arbol getA() {
		return a;
	}

	public void setA(Arbol a) {
		this.a = a;
	}

	public NodoA getAnt() {
		return ant;
	}

	public void setAnt(NodoA ant) {
		this.ant = ant;
	}

	public NodoA getSig() {
		return sig;
	}

	public void setSig(NodoA sig) {
		this.sig = sig;
	}
	
	
	

}
