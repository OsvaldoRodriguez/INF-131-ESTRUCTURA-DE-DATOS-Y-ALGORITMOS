
public class LSimpleF {
	private NodoF p;

	
	public LSimpleF() {
		// TODO Auto-generated constructor stub
		p = null;
	}
	public NodoF getP() {
		return p;
	}

	public void setP(NodoF p) {
		this.p = p;
	}
	
	void adicionar(Facultad f) {
		NodoF nue = new NodoF();
		nue.setF(f);
		if(getP() == null) {
			setP(nue);
		}else {
			NodoF r = getP();
			while(r.getSig() != null) {
				r = r.getSig();
			}
			r.setSig(nue);
		}
	}
	
	void mostrar() {
		System.out.println("LISTA DE FACULTADES");
		NodoF r = getP();
		while(r != null) {
			Facultad f = r.getF();
			f.mostrar();
			r = r.getSig();
		}
	}
	
	int total_carrera_x_facultad() {
		NodoF q = getP();
		int ans = 0;
		while(q != null) {
			int cur = q.getF().getC().contar_nodos(q.getF().getC().getRaiz());
			ans += cur;
			q = q.getSig();
		}
		return ans;
	}
	
	
	
}
