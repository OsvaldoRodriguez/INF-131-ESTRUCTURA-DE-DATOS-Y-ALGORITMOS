
public class ColaSimple {
	private int ini, fin, max = 50;
	private Estudiante A[] = new Estudiante[max + 1];
	
	public ColaSimple() {
		// TODO Auto-generated constructor stub
		ini = fin = 0;
	}
	
	boolean esvacia() {
		return ini == 0 && fin == 0;
	}
	
	boolean esllena() {
		return fin == max;
	}
	
	int nroelem() {
		return fin - ini;
	}
	
	void adicionar(Estudiante x) {
		if(! esllena()) {
			fin++;
			A[fin] = x;
		}else
			System.out.println("Cola llena");
	}
	
	Estudiante eliminar() {
		Estudiante cur = null;
		if(! esvacia()) {
			ini++;
			cur = A[ini];
			if(ini == fin)
				ini = fin = 0;
		}else
			System.out.println("cola vacia");
		return cur;
	}
	
	void vaciar(ColaSimple x) {
		while(! x.esvacia()) {
			adicionar(x.eliminar());
		}
	}
	
	void mostrar() {
		ColaSimple aux = new ColaSimple();
		if(esvacia())
			System.out.println("cola simple vacia");
		else {			
			while(! esvacia()) {
				Estudiante cur = eliminar();
				aux.adicionar(cur);
				cur.mostrar();
			}
			vaciar(aux);
		}
	}
}
