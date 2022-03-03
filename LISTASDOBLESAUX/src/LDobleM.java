import javax.crypto.Mac;

public class LDobleM {
	private NodoM p;
	public LDobleM() {
		p = null;
	}
	public NodoM getP() {
		return p;
	}
	public void setP(NodoM p) {
		this.p = p;
	}
	int nroElem() {
		int c = 0;
		NodoM r = getP();
		while(r != null) {
			r = r.getSig();
			c++;
		}
		return c;
	}
	
	void adiprincipio(Materia m) {
		NodoM nue = new NodoM();
		nue.setM(m);
		if(getP() == null)
			setP(nue);
		else {
			nue.setSig(getP());
			getP().setAnt(nue);
			setP(nue);
		}
	}
	
	void adifinal(Materia m ) {
		NodoM nue = new NodoM();
		nue.setM(m);
		if(getP() == null) {
			setP(nue);
		}else {
			NodoM r = getP();
			while(r.getSig() != null)
				r = r.getSig();
			
			r.setSig(nue);
			nue.setAnt(r);
		}
	}
	void leer(int n) {
		for(int i = 0; i < n; i++) {
			Materia m = new Materia();
			m.leer();
			adifinal(m);
		}
	}
	void mostrar() {
		NodoM r = getP();
		while(r != null) {
			r.getM().mostrar();
			r = r.getSig();
		}
	}
}