
public class Principal {

	
	public static void main(String[] args) {
		
		LSimpleM a=new  LSimpleM();
		a.leer1(Leer.datoInt());
		a.mostrar();
		//a.
		mostrarDisDepMedPaisX(a.getP(), Leer.dato());
		//b.
		ContarMedallasPaisX(a.getP(), Leer.dato(),0,0,0);
		
	}
	public static void mostrarDisDepMedPaisX(Nodo q,String x)
	{
		if(q!=null)
		{
			if(q.getPais().equals(x))
			{
				System.out.println(q.getDisciplina()+" "+q.getDeportista()+" "+q.getMedalla());
				
			}
			
			mostrarDisDepMedPaisX(q.getSig(),x);
		}
	}
	
	public static void ContarMedallasPaisX(Nodo q,String x,int or,int pl,int br)
	{
		if(q!=null)
		{
			if(q.getPais().equals(x))
			{
				if(q.getMedalla().equals("oro"))
					or++;
				if(q.getMedalla().equals("plata"))
					pl++;
				if(q.getMedalla().equals("bronce"))
					br++;

			}

			ContarMedallasPaisX(q.getSig(), x, or, pl, br);
		}
		else
			System.out.println("Oro: "+or+"\nPlata: "+pl+"\nBronce: "+br);
			
	}
	
	

}
