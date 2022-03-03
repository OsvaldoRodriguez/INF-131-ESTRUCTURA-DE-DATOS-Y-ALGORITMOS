
public class LsimpleE {
	private NodoE p;
	
	LsimpleE()
	{
		p=null;
	}

	public NodoE getP() {
		return p;
	}

	public void setP(NodoE p) {
		this.p = p;
	}
	
	
	public void adicionar(Expositor a,NodoA d1)
	{
		NodoE nue=new NodoE();
		nue.setEx(a);
		nue.setD1(d1);
		if(getP()==null)
			setP(nue);
		else
		{
			NodoE r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			
			r.setSig(nue);
			
		}
	}
	
	
	public void leer(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Expositor x=new Expositor();
			x.leer();
			LSimpleA art=new LSimpleA();
			System.out.println("dig tam d e artesanias");
			art.leer(Leer.datoInt());
			adicionar(x,art.getP());
		}
	}

	public void mostrar()
	{
		NodoE w=getP();
		System.out.println("LIsta Expositor");
		while(w!=null)
		{
			w.getEx().mostrar();
			System.out.println();
			LSimpleA aux=new LSimpleA();
			aux.setP(w.getD1());
			aux.mostrar();
			System.out.println("\n");
			w=w.getSig();
		}
	}
	
	
}
