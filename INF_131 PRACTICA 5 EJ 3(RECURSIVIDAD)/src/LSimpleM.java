
public class LSimpleM {
	private Nodo p;
	
	LSimpleM()
	{
		p=null;
	}

	public Nodo getP() {
		return p;
	}

	public void setP(Nodo p) {
		this.p = p;
	}
	
	public void adiprincipio(String a,String b,String c,String d)
	{
		Nodo nue=new Nodo();
		nue.setDisciplina(a);
		nue.setDeportista(b);
		nue.setMedalla(c);
		nue.setPais(d);
		
		nue.setSig(getP());
		setP(nue);
	}
	
	public void adifinal(String a,String b,String c,String d)
	{
		Nodo nue=new Nodo();
		nue.setDisciplina(a);
		nue.setDeportista(b);
		nue.setMedalla(c);
		nue.setPais(d);
		
		if(getP()==null)
			setP(nue);
		else
		{
			Nodo q=getP();
			while(q.getSig()!=null)
				q=q.getSig();
			q.setSig(nue);
		}
	}
	
	
	public void leer1(int n)
	{
		for(int i=1;i<=n;i++)
			adiprincipio(Leer.dato(),Leer.dato(),Leer.dato(),Leer.dato());
	}
	
	public void leer2(int n)
	{
		for(int i=1;i<=n;i++)
			adifinal(Leer.dato(),Leer.dato(),Leer.dato(),Leer.dato());
	}

	public void mostrar()
	{
		Nodo q=getP();
		while(q!=null)
		{
			System.out.print(" "+q.getDisciplina()+" "+q.getDeportista()+" "+q.getMedalla()+" "+q.getPais()+" --->  ");
			q=q.getSig();
		}
	}
	
}
