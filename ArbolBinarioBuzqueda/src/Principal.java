
public class Principal {
	public static void main(String[]args)
	{
		ArbolBB a=new ArbolBB();
		a.setRaiz(new Nodo());
		a.getRaiz().setNro(0);
		a.crear(Leer.datoInt());
		a.mostrar(a.getRaiz());
		
		
	}

}
