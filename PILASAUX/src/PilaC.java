
public class PilaC {
	private int max = 50;
	private Calzado v[] = new Calzado[max + 1];
	private int tope;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getTope() {
		return tope;
	}
	public void setTope(int tope) {
		this.tope = tope;
	}
	
	PilaC(){
		tope = 0;
		//for(int i = 1; i <= max; i++)
			//v[i] = new Calzado(); es opcional este for
	}
	
	boolean esvacia() {
		return tope == 0;
	}
	boolean esllena() {
		return tope == max;
	}
	int nroElem() {
		return tope;
	}
	void adicionar(Calzado x) {
		if(!esllena()) {
			tope++;
			v[tope] = x;
		}else System.out.println("esta llena");
	}
	
	Calzado eliminar() {
		Calzado aux = new Calzado();
		if(!esvacia()) {
			aux = v[tope];
			tope--;
		}else
			System.out.println("pila vacia");
		return aux;
	}
	void vaciar(PilaC x) {
		while(!x.esvacia()) {
			adicionar(x.eliminar());
		}
	}
	void mostrar() {
		System.out.println("Elementos pila");
		if(esvacia())System.out.println("pila vacia");
		else {
			PilaC aux = new PilaC();
			while(!esvacia()) {
				Calzado c = eliminar();
				c.mostrar();
				aux.adicionar(c);
			}
			vaciar(aux);
		}
		
	}
	void llenar(int x) {
		for(int i = 1; i <= x; i++) {
			Calzado aux = new Calzado();
			aux.leer();
			adicionar(aux);
			
		}
	}
}
