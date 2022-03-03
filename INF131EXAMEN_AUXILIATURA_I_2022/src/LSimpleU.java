
public class LSimpleU {
	private NodoU p;

	public NodoU getP() {
		return p;
	}

	public void setP(NodoU p) {
		this.p = p;
	}
	
	
	void adicionar(Universidad u) {
		NodoU nue = new  NodoU();
		nue.setU(u);
		if(getP() == null) {
			setP(nue);
		}else {
			NodoU q = getP();
			while(q.getSig() != null) {
				q = q.getSig();
			}
			
			q.setSig(nue);
		}
	}
	
	void mostrar() {
		System.out.println("UNIVERSIDADES");
		NodoU q = getP();
		while(q != null) {
			Universidad u = q.getU();
			u.mostrar();
			q = q.getSig();
		}
	}
	
	void Univ_mas_carreras() {
		NodoU q = getP();
		int mx = -1;
		while(q != null) {
			int cur = q.getU().getLf().total_carrera_x_facultad();
			if(cur > mx) {
				mx = cur;
			}
			
			q = q.getSig();
		}
		System.out.println("maximo: " + mx);
		q = getP();
		while(q != null) {
			int cur = q.getU().getLf().total_carrera_x_facultad();
			if(cur == mx) {
				System.out.println(
						q.getU().getNombre());
			}
			
			q = q.getSig();
		}
	}
	
	void falcultad_mas_carreras(String Q) {
		NodoU q = getP();
		while(q != null) {
			Universidad u = q.getU();
			if(u.getNombre().equals(Q)) {
				NodoF r = q.getU().getLf().getP();
				int mx = 0;
				while(r != null) {
					int cur = r.getF().getC().contar_nodos(r.getF().getC().getRaiz());
					if(cur > mx)
						mx = cur;
					
					r = r.getSig();
				}
				
				r = q.getU().getLf().getP();
				while(r != null) {
					int cur = r.getF().getC().contar_nodos(r.getF().getC().getRaiz());
					if(cur == mx)
						System.out.println(r.getF().getNombre());
					r = r.getSig();
				}
				
			}
			q = q.getSig();
		}
	}
	
	void univ_mas_estudiantes() {
		NodoU r = getP();
		int estudiantes = 0;
		while(r != null) {
			Universidad u = r.getU();
			NodoF q = u.getLf().getP();
			int temp = 0;
			while(q != null) {
				int cur = q.getF().getC().total_estudiantes(q.getF().getC().getRaiz());
				temp += cur;
				
				q = q.getSig();
			}
			if(estudiantes < temp)
				estudiantes = temp;
			r = r.getSig();
		}
		System.out.println("total " + estudiantes);
		r = getP();
		while(r != null) {
			Universidad u = r.getU();
			NodoF q = u.getLf().getP();
			int temp = 0;
			while(q != null) {
				int cur = q.getF().getC().total_estudiantes(q.getF().getC().getRaiz());
				temp += cur;
				
				q = q.getSig();
			}
			if(estudiantes == temp) {
				System.out.println(u.getNombre());
			}
			r = r.getSig();
		}
		
	}
	
	void agregar_carrera(Carrera M, String facultad, String unviersidad) {
		NodoU q = getP();
		while(q != null) {
			Universidad u = q.getU();
			if(u.getNombre().equals(unviersidad)) {
				NodoF r = u.getLf().getP();
				while(r != null) {
					Facultad f = r.getF();
					if(f.getNombre().equals(facultad)) {
						r.getF().getC().agregar(r.getF().getC().getRaiz(), M);
					}
					r = r.getSig();
				}
			}
			q = q.getSig();
		}
	}
}
