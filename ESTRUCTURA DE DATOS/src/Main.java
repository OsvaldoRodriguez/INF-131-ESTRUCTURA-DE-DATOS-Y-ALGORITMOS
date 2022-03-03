
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila a = new Pila();
		
		Estudiante e1 = new Estudiante(123, "Rodriguez", "Osvaldo");
		Estudiante e2 = new Estudiante(123, "Ramirez", "Juan");
		Estudiante e3 = new Estudiante(123, "Rodriguez", "Oliver");
		Estudiante e4 = new Estudiante(123, "Rodriguez", "Nelson");
		Estudiante e5 = new Estudiante(123, "Quino", "Ramiro");
		Estudiante e6 = new Estudiante(128, "Apaza", "Elsa");
		Estudiante e7 = new Estudiante(123, "Apaza", "Nora");
		
		
		a.adicionar(e1);
		a.adicionar(e2);
		a.adicionar(e3);
//		a.mostrar();
//		System.out.println(a.nro_elem());
		
		ColaSimple c = new ColaSimple();
		c.adicionar(e1);
		c.adicionar(e2);
		c.adicionar(e3);
//		c.eliminar();
//		c.eliminar();
//		c.eliminar();
//		
//		c.mostrar();
//		System.out.println(c.nroelem());
	
		ColaCircular cc = new ColaCircular();
		
		cc.adicionar(e1);
		cc.adicionar(e2);
		cc.eliminar();
		cc.adicionar(e3);
		cc.eliminar();
		cc.adicionar(e4);
		cc.eliminar();
		cc.eliminar();
//		cc.mostrar();
		
		
		
		ListaSimple l = new ListaSimple();
		l.adicionar(e1);
		l.adicionar(e2);
		l.adicionar(e3);
		l.adicionar(e4);
		l.adicionar(e5);
//		l.mostrar();
		
		l.eliminar(123);
//		l.mostrar();
		
//		System.out.println("adi");
//		l.adicionar(e7);
//		l.mostrar();
		
		ListaDoble ll = new ListaDoble();
		ll.adicionar(e1);
		ll.adicionar(e2);
		ll.adicionar(e3);
		ll.adicionar(e4);
		ll.adicionar(e5);
//		ll.mostrar();
	
		
		// Arboles
		
		ABinarioE tree = new ABinarioE();
//		tree.setRaiz(new NodoAE());
//		tree.crear(tree.getRaiz());
//		tree.preorden(tree.getRaiz());
		
		tree.crear_iterativo();
		tree.mostrar_iterativo();
	}

}
