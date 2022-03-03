
public class ArbolBB {
	private Nodo raiz;

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	void cargar(int n)
	{
		if(raiz==null)
		{
			Nodo raiz=new Nodo();
			raiz.setNro(n);
			
		}
		else
		{
			Nodo r=getRaiz();
			
			while(r!=null)
			{
				if(n>r.getNro())
				{
					if(r.getDer()!=null)
						r=r.getDer();
					else
					{
						Nodo nue=new Nodo();
						nue.setNro(n);
						r.setDer(nue);
						r=null;
					}
				}
				else
				{
					if(n<r.getNro())
					{
						if(r.getIzq()!=null)
							r=r.getIzq();
						else
						{
							Nodo nue=new Nodo();
							nue.setNro(n);
							r.setIzq(nue);
							r=null;
						}
					}
					else
					{
						if(n==r.getNro())
						{
							System.out.println("existe");
							r=null;
						}
					}
				}
			}
		}
	}
	
	void crear(int n)
	{
		for(int i=0;i<n;i++)
		{
			int q=Leer.datoInt();
			cargar(q);
		}
	}
	
	void mostrar(Nodo r)
	{
		if(r!=null)
		{
			System.out.print(r.getNro()+" ");
			mostrar(r.getIzq());
			mostrar(r.getDer());
		}
	}
	
}
