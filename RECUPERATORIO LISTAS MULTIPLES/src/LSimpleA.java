
public class LSimpleA {
	private NodoA p;

	LSimpleA()
	{
		p=null;
	}
	public NodoA getP() {
		return p;
	}

	public void setP(NodoA p) {
		this.p = p;
	}
	
	public void adicionar(Artesania a)
	{
		NodoA nue=new NodoA();
		nue.setAr(a);
		if(getP()==null)
			setP(nue);
		else
		{
			NodoA r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			
			r.setSig(nue);
			
		}
	}
	
	
	public void leer(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Artesania x=new Artesania();
			x.leer();
			adicionar(x);
		}
	}

	public void mostrar()
	{
		NodoA w=getP();
		System.out.println("LIsta artesania");
		while(w!=null)
		{
			w.getAr().mostrar();
			w=w.getSig();
		}
	}
	
}
