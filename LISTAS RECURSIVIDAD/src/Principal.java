
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	LDobleA a=new LDobleA();
		a.leer(Leer.datoInt());
		//1.
		a.mostraR(a.getP());
		System.out.println("\n+++++++++++++++++++++++++++++++");
		mostraR(a.getP());
		System.out.println();
		//2. determinar la mayor edad de los arboles
		System.out.println("Mayor edad es: "+mayor(a.getP()));
		//3. mostrar a los arboles con la mayor edad
		mayores(a.getP(),mayor(a.getP()));
		//4. contar cuantos arboles existen en la lista
		System.out.println("\nExisten: "+contar(a.getP()));
		
	*/
		
	//con multilistas
		//5.
		LSimpleZ b=new LSimpleZ();
		b.leer(Leer.datoInt());
		mostrarZ(b.getP());
		//6.cuantos arboles tiene cada zona
		cuantos(b.getP());
		//7. determinar la mayor edad de los arboles d todas las zonas
		System.out.println(supermayor(b.getP()));
		//8. de cada zona verificar si existe algun pino
		veriPino(b.getP());
		
	}
	//recursividad
	
	
	public static void veriPino(NodoZ q)
	{
		if(q!=null)
		{
			if(pino(q.getLa().getP()))
				System.out.println(q.getZona()+" "+pino(q.getLa().getP()));
			else
				System.out.println(q.getZona()+" "+pino(q.getLa().getP()));
			
			veriPino(q.getSig());
		}
		
	}
	public static boolean pino(NodoA q)
	{
		if(q!=null)
		{
			if(q.getA().getNombre().equals("pino"))
				return true;
			return pino(q.getSig());
		}
		else
			return false;
	}
	public static int supermayor(NodoZ q)
	{
		if(q!=null)
		{
			int may=supermayor(q.getSig());
			if(may>mayor(q.getLa().getP()))
				return may;
			return mayor(q.getLa().getP());
		}
		else return 0;
	}
	public static void cuantos(NodoZ q)
	{
		if(q!=null)
		{
			System.out.println(q.getZona()+" " +contar(q.getLa().getP()));
			cuantos(q.getSig());	
		}
	}
	
	
	public  static void mostrarZ(NodoZ r)
	{
		if(r!=null)
		{
			System.out.println(r.getZona());
			mostraR(r.getLa().getP());
			System.out.println();
			mostrarZ(r.getSig());
		}
	}
	public static int contar(NodoA q)
	{
		if(q!=null)
			return contar(q.getSig())+1; 
		return 0;
	}
	public static void mayores(NodoA q,int x)
	{
		if(q!=null)
		{
			if(q.getA().getEdad()==x)
				System.out.print(q.getA().getCod()+" "+q.getA().getNombre()+" "+q.getA().getEdad()+"--> ");
			
			mayores(q.getSig(), x);
			
		}
	}
	public static void mostraR(NodoA r)
	{
		if(r!=null)
		{
			System.out.print(r.getA().getCod()+" "+r.getA().getNombre()+" "+r.getA().getEdad()+"--> ");
			mostraR(r.getSig());
		}
	}
	
	public static int mayor(NodoA r)
	{
		if(r!=null)
		{
			int may=mayor(r.getSig());
			if(may>r.getA().getEdad())
				return may;
			return r.getA().getEdad();
		}
		else
			return -1;
	}
	
	
	
	
	
	
	
}
