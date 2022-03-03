
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CSimpleN a=new CSimpleN();
		CSimpleN b=new CSimpleN();
		
		a.llenar(Leer.datoInt());
		b.llenar(Leer.datoInt());
		a.mostrar();
		b.mostrar();
		System.out.println("\n"+verifica(a, b));
		System.out.println("\n" + verifica1(a,b));
	}
	
	public static boolean verifica(CSimpleN a,CSimpleN b)
	{
		if(a.esvacia() && b.esvacia())
			return true;
		else
		{
			if(a.esvacia() || b.esvacia())
				return false;
			else
			{
				int x=a.eliminar();
				int y =b.eliminar();
					
				if(x==y)
					return verifica(a, b);
				else
					return false;
			}
		}
	}
	
	public static boolean verifica1(CSimpleN a,CSimpleN b) {
		if(a.esvacia() && b.esvacia())
			return true;
		if(a.esvacia() || b.esvacia())
			return false;
		int x = a.eliminar();
		int y = b.eliminar();
		return verifica(a,b) && x == y;
	}

}
