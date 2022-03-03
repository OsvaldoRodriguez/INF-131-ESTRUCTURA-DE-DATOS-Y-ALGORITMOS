import java.util.Scanner;

public class ABinarioE {
	private NodoAE raiz;

	ABinarioE(){
		raiz = null;
	}
	
	public NodoAE getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoAE raiz) {
		this.raiz = raiz;
	}
	
	void crear(NodoAE r) {// recursivo
		Scanner in = new  Scanner(System.in);
		NodoAE cur = new NodoAE();
		if(r != null) {
			Estudiante e = new Estudiante();
			e.leer();
			cur.setE(e);  
			System.out.println("Hijo izquierdo? s/n");
			String opcion = in.next();
			if(opcion.equals("s")) {
				r.setIzq(cur);
				crear(r.getIzq());
			}
			System.out.println("Hijo derecho s/n");
			opcion = in.next();
			if(opcion.equals("s")) {
				r.setDer(cur);
				crear(r.getDer());
			}
		}
	}
	
	
	void crear_iterativo() {
		Scanner in = new Scanner(System.in);
		ColaSE padre = new ColaSE();
		ColaSE hijo = new ColaSE();
		
		raiz = new NodoAE();
		Estudiante estudiante = new  Estudiante();
		estudiante.leer();
		raiz.setE(estudiante);
		padre.adicionar(raiz);
		
		while(! padre.es_vacia()) {
			
			while( ! padre.es_vacia()) {
				
				NodoAE r = padre.eliminar();
				System.out.println("Hijo izquierdo?");
				String opcion = in.next();
				//NodoAE nue = new NodoAE();
				if(opcion.equals("s")) {
					Estudiante x = new Estudiante();
					NodoAE nue = new NodoAE();
					
					x.leer();
					nue.setE(x);
					r.setIzq(nue);
					hijo.adicionar(r.getIzq());
				}
				System.out.println("hijo derecho?");
				opcion = in.next();
				if(opcion.equals("s")) {
					NodoAE nue = new NodoAE();
					
					Estudiante x = new Estudiante();
					x.leer();
					nue.setE(x);
					r.setDer(nue);
					hijo.adicionar(r.getDer());
				}
			}
			
			padre.vaciar(hijo);
		}
		
		
	}
	
	void mostrar_iterativo() {
		ColaSE padre = new ColaSE();
		ColaSE hijo = new ColaSE();
		padre.adicionar(raiz);
		while(! padre.es_vacia()) {
			while(! padre.es_vacia()) {
				NodoAE r = padre.eliminar();
				r.getE().mostrar();
				if(r.getIzq() != null){
					hijo.adicionar(r.getIzq());
				}
				if(r.getDer() != null) {
					hijo.adicionar(r.getDer());
				}
				
			}
			padre.vaciar(hijo);
		}
		
	}
	
	void preorden(NodoAE r) {
		if(r != null) {
			Estudiante cur = r.getE();
			cur.mostrar();
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}
	
}
