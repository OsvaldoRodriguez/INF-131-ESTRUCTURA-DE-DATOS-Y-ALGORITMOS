
public class LSimpleE {
	private NodoE p;

	public NodoE getP() {
		return p;
	}

	public void setP(NodoE p) {
		this.p = p;
	}
	public LSimpleE() {
		p = null;
	}
	public int nroElem() {
		NodoE q = getP();
		int c = 0;
		while(q != null) {
			c++;
			q = q.getSig();
		}	
		return c;
		
	}
	public void adiprincipio(Estudiante e) {
		NodoE  nue = new NodoE();
		nue.setE(e);
		nue.setSig(getP());
		setP(nue);
	}
	
	public void adifinal(Estudiante e) {
		NodoE nue = new NodoE();
		nue.setE(e);
		if(getP() == null)
			setP(nue);
		else {
			NodoE r = getP();
			while(r.getSig() != null)
				r = r.getSig();
			r.setSig(nue);
		}
	}
	public void leer(int n) {
		for(int i = 0; i < n; i++) {
			Estudiante e = new Estudiante();
			e.leer();
			adifinal(e);
			
		}
	}    
	public  void mostrar() {
		NodoE q = getP();
		while(q != null) {
			Estudiante e = q.getE();
			e.mostrar();
			q = q.getSig();
		}
	}
}
