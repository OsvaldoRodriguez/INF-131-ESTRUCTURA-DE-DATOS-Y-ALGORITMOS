
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleE l = new LSimpleE();
		l.leer(Leer.datoInt());
		l.mostrar();
		
		LSimpleE l1 = new LSimpleE();
		l1.leer(Leer.datoInt());
		l1.mostrar();
		//mostrarNombreX(l,Leer.dato());
		//unirListas(l, l1, Leer.datoInt());
		//l.mostrar();
		//eliminarNomX(l, Leer.dato());
		//l.mostrar();
		System.out.println("intercalar");
		int t1 = l.nroElem();
		int t = l1.nroElem();
		LSimpleE aux;
		if(t1 < t) 
			aux = Intercalar(l, l1);
		
		else 
			aux = Intercalar(l1, l);
		
		aux.mostrar();
		
	}
	public static void mostrarNombreX(LSimpleE a,String x) {
		NodoE r = a.getP();
		while(r != null) {
			Estudiante y = r.getE();
			if(y.getNom().equals(x))
				y.mostrar();
			r = r.getSig();
		}
	}
	
	public static void unirListas(LSimpleE a,LSimpleE b,int i) {
		NodoE r = a.getP();
		int c = 0;
		while(r != null) {
			c++;
			if(c == i) {
				NodoE z = r.getSig();
				r.setSig(b.getP());
				while(r.getSig() != null)
					r = r.getSig();
				r.setSig(z);
			}else r = r.getSig();
		}
	}
	public static void eliminarNomX(LSimpleE a,String x) {
		NodoE q = a.getP();
		NodoE z = q;
		while(q != null) {
			if(q.getE().getNom().equals(x)) {
				if(q == a.getP()) {
					a.setP(q.getSig());
					q.setSig(null);
					z = q = a.getP();
				}else {
					z.setSig(q.getSig());
					q.setSig(null);
					q = z;
				}
			}else {
				z = q;
				q = q.getSig();
			}
		}
	}
	
	public static LSimpleE Intercalar(LSimpleE men,LSimpleE may) {
		
			NodoE r = men.getP();
			NodoE w = may.getP();
			System.out.println(men.nroElem());
			int tam = men.nroElem();
			for(int i = 0; i < tam - 1; i++) {
				NodoE r1 = r.getSig();
				NodoE w1 = w.getSig();
				r.setSig(w);
				w.setSig(r1);
				r = r1;
				w = w1;
			}
			r.setSig(w);
			return men;
		
	}

}
