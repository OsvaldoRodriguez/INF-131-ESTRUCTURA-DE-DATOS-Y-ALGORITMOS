
public class ListaSimple {
	private NodoLS p;
	public ListaSimple() {
		// TODO Auto-generated constructor stub
		p = null;
	}
	public NodoLS getP() {
		return p;
	}
	public void setP(NodoLS p) {
		this.p = p;
	}
	
	void adicionar(Estudiante e) {
		NodoLS cur = new NodoLS();
		cur.setE(e);
		if(getP() == null) {
			setP(cur);
		}else {
			NodoLS q = getP();
			while(q.getSig() != null) {
				q = q.getSig();
			}
			
			q.setSig(cur);
		}
	}
	
	void mostrar() {
		NodoLS cur = getP();
		System.out.println("DATOS LISTA SIMPLE");
		while(cur != null) {
			Estudiante e = cur.getE();
			e.mostrar();
			cur = cur.getSig();
		}
	}
	
	void eliminar(int ci) {
		NodoLS cur = getP();
		NodoLS last = cur;
		
		while(cur != null) {
			Estudiante e = cur.getE();
			if(e.getCi() == ci) {	
				if(cur == getP()) {
					cur = cur.getSig();
					setP(cur);
					last = cur;
				}else {
					last.setSig(cur.getSig());
					cur = cur.getSig();
				}
			}else {
				last = cur;
				cur = cur.getSig();
			}
		}
	}
}
