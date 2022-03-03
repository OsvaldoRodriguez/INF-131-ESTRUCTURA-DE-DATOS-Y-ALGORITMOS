
public class ColaSE {
	private int max = 50;
	private int ini, fin;
	private NodoAE v[] = new NodoAE[max + 1];
	
	ColaSE() {
		ini = fin = 0;
	}
	
	boolean es_vacia() {
		return ini == 0 && fin == 0;
	}
	
	boolean es_llena() {
		return max == fin;
	}
	
	void adicionar(NodoAE cur) {
		if(! es_llena()) {
			fin++;
			v[fin] = cur;
		}else {
			System.out.println("Cola llena");
		}
	}
	
	NodoAE eliminar() {
		NodoAE eli = null;
		if(! es_vacia()) {
			ini++;
			eli = v[ini];
			if(ini == fin)
				ini = fin = 0;
		}else
			System.out.println("cola vacia");
		return eli;
	}
	
	void vaciar(ColaSE aux) {
		while(!aux.es_vacia()) {
			adicionar(aux.eliminar());
		}
	}
	
}
