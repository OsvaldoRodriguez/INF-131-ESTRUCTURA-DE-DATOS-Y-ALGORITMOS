
public class ColaCircular {
	private int ini, fin, max = 50;
	private Estudiante A[] = new Estudiante[max + 1];
	
	public ColaCircular() {
		// TODO Auto-generated constructor stub
		ini = fin = 0;
	}
	
	int nroelem() {
		return (fin - ini + max) % max;
	}
	
	boolean esvacia() {
		return nroelem() == 0;
	}
	
	boolean esllena() {
		return nroelem() == max - 1;
	}
	
	void adicionar(Estudiante x) {
		if(! esllena()) {
			fin = (fin + 1) % max;
			A[fin] = x;
		}else
			System.out.println("cola llena");
	}
	
	Estudiante eliminar() {
		Estudiante cur = null;
		if(!esvacia()) {
			ini = (ini + 1) % max;
			cur = A[ini];
			if(nroelem() == 0)
				ini = fin = 0;
		}else
			System.out.println("cola vacia");
		
		return cur;
	}
	
	void vaciar(ColaCircular cur) {
		while(! cur.esvacia()) {
			adicionar(cur.eliminar());
		}
		
	
	}
	
	void mostrar() {
		ColaCircular aux = new ColaCircular();
		System.out.println("COLA CIRCULAR");
		if(! esvacia()) {
			while(!esvacia()) {
				Estudiante cur = eliminar();
				aux.adicionar(cur);
				cur.mostrar();
			}
			vaciar(aux);
		}else
			System.out.println("cola circular vacia");
	}
}
