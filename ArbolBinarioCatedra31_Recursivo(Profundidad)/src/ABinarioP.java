
public class ABinarioP {
	NodoP raiz;
	ABinarioP(){
		raiz=null;
	}
	public NodoP getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoP raiz) {
		this.raiz = raiz;
	}
	
	void crear(NodoP r)
	{
		if(r!=null)
		{
			String p=Leer.dato();
			r.setPalabra(p);
			System.out.println("Tendra izq s/n");
			String res=Leer.dato();
			if(res.equals("s"))
			{
				NodoP nue=new NodoP();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.println("Tendra der s/n");
			res=Leer.dato();
			if(res.equals("s"))
			{
				NodoP nue=new NodoP();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	
	void preorden(NodoP r)
	{
		if(r!=null)
		{
			System.out.print(r.getPalabra()+" ");
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}
	
	void mostrarHojas(NodoP r)//recorrido preorden
	{
		if(r!=null)
		{
			if(r.getDer()==null && r.getIzq()==null)
				System.out.println(r.getPalabra());
			mostrarHojas(r.getIzq());
			mostrarHojas(r.getDer());
		}
	}
	
	public int unDescendiente(NodoP r)
	{
		if(r!=null)
		{
			int c=unDescendiente(r.getDer())+unDescendiente(r.getIzq());
			if((r.getDer()==null && r.getIzq()!=null) ||(r.getDer()!=null && r.getIzq()==null))
				c++;
			
			return c;
		}
		else 
			return 0;
	}
	
	int contar(NodoP r)
	{
		if(r!=null)
			return contar(r.getDer())+contar(r.getIzq())+1;
		 return 0;
	}
	
	//tarea resuelta de catedra
	
	int contarHojas(NodoP r)
	{
		if(r!=null)
		{
			int c=contarHojas(r.getIzq())+contarHojas(r.getDer());
			if(r.getIzq()==null && r.getDer()==null)
				c++;
			return c;
		}
		return 0;
	}
	
	int dosDescendientes(NodoP r)
	{
		if(r!=null)
		{
			int c=dosDescendientes(r.getDer())+dosDescendientes(r.getIzq());
			if(r.getIzq()!=null && r.getDer()!=null)
				c++;
			return c;
				
		}else return 0;
	}
	
	boolean verificaPalabraX(NodoP r,String x)
	{
		if(r!=null)
		{
			if(r.getPalabra().equals(x))
				return true;
			return verificaPalabraX(r.getIzq(), x)||verificaPalabraX(r.getDer(), x);
			
		}
		return false;
	}
	
	int ramas(NodoP r)
	{
		if(r!=null)
		{
			if(r.getIzq()!=null ||r.getDer()!=null)
				return ramas(r.getIzq())+ramas(r.getDer())+1;
			return ramas(r.getIzq())+ramas(r.getDer());
		}
		else
		return 0;
	}
	
}
