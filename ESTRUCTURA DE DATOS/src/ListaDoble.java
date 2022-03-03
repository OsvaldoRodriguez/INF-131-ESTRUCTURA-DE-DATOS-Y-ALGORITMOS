
public class ListaDoble {
	private NodoLD p;

	public NodoLD getP() {
		return p;
	}

	public void setP(NodoLD p) {
		this.p = p;
	}
	
	
	void adicionar(Estudiante e) {
		NodoLD cur = new  NodoLD();
		cur.setE(e);
		
		NodoLD q = getP();
		if(q == null) {
			setP(cur);
		}else {
			while(q.getSig() != null) {
				q = q.getSig();
			}
			q.setSig(cur);
			cur.setAnt(q);
		}
	}
	
	void mostrar() {
		System.out.println("LISTA DOBLE");
		NodoLD q = getP();
		while(q != null) {
			Estudiante e = q.getE();
			e.mostrar();
			q = q.getSig();
		}
	}
}	
