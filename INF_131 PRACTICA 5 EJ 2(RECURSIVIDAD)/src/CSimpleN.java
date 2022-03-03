
public class CSimpleN {
	private int max = 50;
	private int v[] = new int[max + 1];
	private int ini, fin;

	public CSimpleN() 
	{
		ini = fin = 0;
	}

	boolean esvacia() 
	{
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}

	boolean esllena() 
	{
		if (fin == max)
			return (true);
		return (false);
	}

	int nroelem() 
	{
		return (fin - ini);
	}

	void adicionar(int elem) 
	{
		if (!esllena()) 
		{
			fin++;
			v[fin] = elem;
		} 
		else
			System.out.println("Cola Simple llena");
	}

	int eliminar() 
	{
		int elem=0 ;
		if (!esvacia())
		{
			ini++;
			elem = v[ini];
			if (ini == fin)
				ini = fin = 0;
		} 
		else
			System.out.println("Cola Simple vacia");
		
		return (elem);
	}

	void mostrar() 
	{
		int elem;
		if (esvacia())
			System.out.println("Cola vacia");
		else 
		{
			System.out.println("\n Zonas de la Cola ");
			CSimpleN aux = new CSimpleN();
			while (!esvacia()) 
			{
				elem = eliminar();
				aux.adicionar(elem);
				System.out.print(elem+" ");
			}
			vaciar(aux);
		}
	}

	void llenar(int n) 
	{
		for (int i = 1; i <= n; i++)
		{
			int z;
			z=Leer.datoInt();
			adicionar(z);
		}
	}

	void vaciar(CSimpleN a)
	{
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
