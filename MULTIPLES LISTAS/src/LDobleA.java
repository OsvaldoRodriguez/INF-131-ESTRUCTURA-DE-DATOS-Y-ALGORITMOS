
public class LDobleA {
	private NodoA p;

	LDobleA()
	{
		p=null;
	}
	public NodoA getP() {
		return p;
	}

	public void setP(NodoA p) {
		this.p = p;
	}
	
	

	void adicion (Arbol b)
	{
		NodoA nue = new NodoA ();
		nue.setA(b);
		if(getP()==null)
			setP(nue);
		else
		{
			NodoA r=getP();
			while (r.getSig()!=null)
				r=r.getSig();
			
			r.setSig(nue);
			nue.setAnt(r);	
		}

	}
	
	public void leer(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Arbol a=new Arbol();
			a.leer();
			adicion(a);
		}
	}
	
	public void mostrar()
	{
		NodoA r=getP();
		while(r!=null)
		{
			r.getA().mostrar();
			r=r.getSig();
		}
	}


	

}
