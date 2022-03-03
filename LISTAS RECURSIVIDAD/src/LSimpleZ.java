
public class LSimpleZ {
	private NodoZ p;
	
	LSimpleZ()
	{
		p=null;
	}

	public NodoZ getP() {
		return p;
	}

	public void setP(NodoZ p) {
		this.p = p;
	}
	
	public void adicion(String z,LDobleA l)
	{
		NodoZ nue=new NodoZ();
		nue.setLa(l);
		nue.setZona(z);
		
		if(getP()==null)
			setP(nue);
		else
		{
			NodoZ r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			
			r.setSig(nue);
		}
	}
	
	public void leer(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("dig nom zona");
			String x=Leer.dato();
			LDobleA y=new LDobleA();
			System.out.println("dig tam de lista de arb");
			y.leer(Leer.datoInt());
			adicion(x, y);
			
		}
	}
	
	
	
	public void mostrar()
	{
		NodoZ r=getP();
		while(r!=null)
		{
			System.out.println("\nZONA: "+r.getZona());
			r.getLa().mostrar();
			r=r.getSig();
		}
	}
}
