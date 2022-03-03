
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LsimpleE e=new LsimpleE();
		e.leer(Leer.datoInt());
		e.mostrar();
		//a
		AdiArtExpX(e, Leer.dato(),Leer.datoInt());
		e.mostrar();
		//b.
		System.out.println("agregando dig mat X\n");
		agregar(e,Leer.dato());
		e.mostrar();
	}
	
	public static void AdiArtExpX(LsimpleE a,String x,int i)
	{
		NodoE r=a.getP();
		while(r!=null)
		{
			if(r.getEx().getNomExp().equals(x))
			{
				LSimpleA aux=new LSimpleA();
				aux.setP(r.getD1());
				NodoA w=aux.getP();
				
				for(int j=1;j<i;j++)
					w=w.getSig();
				
				NodoA z=w.getSig();
				Artesania art=new Artesania();
				art.leer();
				NodoA nue=new NodoA();
				nue.setAr(art);
				nue.setSig(z);
				w.setSig(nue);
			}
			
			r=r.getSig();
		}
	}
	
	
	public static void agregar(LsimpleE a,String x)
	{
		NodoE r=a.getP();
		NodoE nue=new NodoE();
		LSimpleA nue2=new LSimpleA();
		Expositor ex=new Expositor();
		ex.leer();
		nue.setEx(ex);
		
		while(r!=null)
		{
			LSimpleA aux=new LSimpleA();
			aux.setP(r.getD1());
			NodoA w=aux.getP();
			NodoA z=w;
			while(w!=null)
			{
				if(w.getAr().getMaterial().equals(x))
				{
					z.setSig(w.getSig());
					nue2.adicionar(w.getAr());
					w=null;
				}
				else
				{
					z=w;
					w=w.getSig();
				}
			}
			r=r.getSig();
		}
		
		r=a.getP();
		while(r.getSig()!=null)
			r=r.getSig();
		
		nue.setD1(nue2.getP());
		nue.setEx(ex);
		r.setSig(nue);
		
	}
}
