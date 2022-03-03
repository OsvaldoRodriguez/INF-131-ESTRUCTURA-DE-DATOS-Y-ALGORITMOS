
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ABinarioP a=new ABinarioP();
			a.setRaiz(new NodoP());
			a.crear(a.getRaiz());
			a.preorden(a.getRaiz());
			System.out.println();
			a.mostrarHojas(a.getRaiz());
			System.out.println();
			System.out.println(a.unDescendiente(a.getRaiz()));
			System.out.println();
			System.out.println(a.contar(a.getRaiz()));
			System.out.println(" las hojas son:"+a.contarHojas(a.getRaiz()));
			System.out.println("Dos descendientes: "+ a.dosDescendientes(a.getRaiz()));
			System.out.println("verificando : "+ a.verificaPalabraX(a.getRaiz(),Leer.dato()));
			System.out.println("ramas : "+a.ramas(a.getRaiz()));
	}

}
