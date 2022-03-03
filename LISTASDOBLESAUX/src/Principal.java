
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LDobleM a = new LDobleM();
		a.leer(Leer.datoInt());
		a.mostrar();
		//adicionarDespuesIesimo(a,Leer.datoInt());
		eliminarMatSiglaX(a, Leer.dato());
		a.mostrar();
	}
	
	public  static void adicionarDespuesIesimo(LDobleM a,int i) {
		NodoM r = a.getP();
		int c = 0;
		while(r != null) {
			c++;
			if(c == i) {
				NodoM nue = new NodoM();
				Materia  m  = new Materia();
				m.leer();
				nue.setM(m);
				NodoM aux = r.getSig();
				r.setSig(nue);
				nue.setAnt(r);
				nue.setSig(aux);
				if(aux != null)
				aux.setAnt(nue);
				break;
			}else
				r = r.getSig();
		}
	}
	
	public static void eliminarMatSiglaX(LDobleM a,String x) {
		NodoM r = a.getP();
		while(r != null) {
			if(r.getM().getSigla().equals(x)) {
				if(r == a.getP()) {
					a.setP(r.getSig());
					r.setSig(null);
					if(a.getP() != null)
					a.getP().setAnt(null);
					r = a.getP();
				}else {
					NodoM w = r.getAnt();
					NodoM z = r.getSig();
					r.getAnt().setSig(z);
					if(r.getSig() != null)
					r.getSig().setAnt(w);
					r.setSig(null);
					r.setAnt(null);
					r = z;
					
				}
			}else r =r.getSig();
		}
	}
}
