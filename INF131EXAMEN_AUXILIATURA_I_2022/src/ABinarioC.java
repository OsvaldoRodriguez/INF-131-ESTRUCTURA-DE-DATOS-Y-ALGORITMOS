import java.util.Scanner;

public class ABinarioC {
	private NodoC raiz;
	private Scanner  in = new Scanner(System.in);
	public NodoC getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoC raiz) {
		this.raiz = raiz;
	}
	
	void agregar(NodoC r, Carrera c) {
		if(r != null) {
			if(r.getIzq() != null) {
				agregar(r.getIzq(), c);
			}else {
				System.out.println("agregando carrera");
//				Carrera c = new Carrera();
//				c.leer();
				NodoC nue = new NodoC();
				nue.setC(c);
				r.setIzq(nue);
				return;
			}
		}
	}
	void crear(NodoC r) {
		if(r != null) {
			
			Carrera c = new Carrera();
			c.leer();
			r.setC(c);
			System.out.println("hijo izquierdo s/n");
			String opcion = in.next();
			if(opcion.equals("s")) {
				NodoC nue = new NodoC();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.println("hijo derecho s/n");
			opcion = in.next();
			if(opcion.equals("s")) {
				NodoC nue = new NodoC();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	
	void mostrar(NodoC r) {
		if(r != null) {
			Carrera c = r.getC();
			c.mostrar();
			mostrar(r.getIzq());
			mostrar(r.getDer());
		}
	}
	
	int contar_nodos(NodoC r) {
		if(r == null)
			return 0;
		return contar_nodos(r.getIzq() ) + contar_nodos(r.getDer()) + 1;
	}
	
	int total_estudiantes(NodoC r) {
		if(r != null) {
			return total_estudiantes(r.getIzq()) + total_estudiantes(r.getDer()) + r.getC().getNroEstudiantes();
		}
		return 0;
	}
	
	
}
