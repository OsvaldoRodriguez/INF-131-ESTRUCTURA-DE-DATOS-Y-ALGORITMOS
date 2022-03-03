
public class Pila {
	private int max = 50;
	private int tope;
	Estudiante A[] = new Estudiante[max + 1];

	Pila() {
		this.tope = 0;
	}
	
	boolean esvacia() {
		return tope == 0;
	}
	boolean esllena() {
		return max == tope;
	}
	
	int nro_elem() {
		return tope;
	}
	
	void adicionar(Estudiante x) {
		if(!esllena()) {
			tope++;
			A[tope] = x;
		}else
			System.out.println("pila llena");
		
	}
	
	Estudiante eliminar() {
		Estudiante cur = null;
		if(! esvacia()) {
			cur = A[tope];
			tope--;
		}else {
			System.out.println("pila vacia");
		}
		return cur;
	}
	
	void vaciar(Pila p) {
		while(!p.esvacia()) {
			adicionar(p.eliminar());
		}
	}
	
	void mostrar() {
		if(esvacia())
			System.out.println("pila vacia");
		else {
			System.out.println("datos de la pila");
			Pila aux = new Pila();
			while(!esvacia()) {
				Estudiante cur = (Estudiante) eliminar();
				cur.mostrar();
				aux.adicionar(cur);
			}
			vaciar(aux);
			
		}
	}
	
}
