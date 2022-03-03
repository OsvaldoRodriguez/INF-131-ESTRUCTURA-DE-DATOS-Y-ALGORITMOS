
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		/*LDobleA a=new LDobleA();
		a.leer(Leer.datoInt());
		a.mostrar();*/
		//2.
		/*LSimpleZ a=new LSimpleZ();
		a.leer(Leer.datoInt());
		a.mostrar();
		//3. agregar un arbol a la 1ra zona 2 a la 2da 3 a la 3ra todos pinos
		plantacion(a);
		a.mostrar();
		
		//4. de cada zona mostrar el iesimo arbol si existe
		iesimoArbol(a,Leer.datoInt());
		//5.
		ultimoArbol(a);
		//6. mostrar a los arboles eucalipto de la zona x
		arbolEucaliptoZonaX(a,Leer.dato());
		//7. que zona tiene menos arboles
		menosArboles(a);*/
	}
	//recursividad
	
	
	
	
	
	public static void menosArboles(LSimpleZ b)
	{
		NodoZ q=b.getP();
		int men=1000000;
		while(q!=null)
		{
			NodoA w=q.getLa().getP();
				int ww=0;
				while(w!=null)
				{
					ww++;
					w=w.getSig();
				}
				if(ww<men)
					men=ww;
			
			q=q.getSig();
			
		}
		q=b.getP();
		while(q!=null)
		{
			NodoA w=q.getLa().getP();
				int ww=0;
				while(w!=null)
				{
					ww++;
					w=w.getSig();
				}
				if(ww==men)
					System.out.println(q.getZona());
			
			q=q.getSig();
			
		}
		
		
	}
	
	public static void arbolEucaliptoZonaX(LSimpleZ b,String z)
	{
		NodoZ q=b.getP();
		
		while(q!=null)
		{
			if(q.getZona().equals(z))
			{
				NodoA w=q.getLa().getP();
				
				while(w.getSig()!=null)
				{
					if(w.getA().getNombre().equals("eucalipto"))
						w.getA().mostrar();
					w=w.getSig();
				}
				
			}
			q=q.getSig();
			
		}
	}
	public static void ultimoArbol(LSimpleZ b)
	{
		NodoZ q=b.getP();
		
		while(q!=null)
		{
			NodoA w=q.getLa().getP();
			
			while(w.getSig()!=null)
			
				w=w.getSig();
			w.getA().mostrar();
			q=q.getSig();
		}
	}
	public static void plantacion(LSimpleZ b)
	{
		NodoZ r=b.getP();
		int a=0,bb=1;
		
		while(r!=null)
		{
			
			int c=a+bb;
			a=bb;
			bb=c;
			for(int i=1;i<=c;i++)
			{
				Arbol x=new Arbol();
				x.setNombre("pino");
				x.setEdad(0);
				x.setAltura(1);
				x.setUbicacion("por definir");
				x.setCod(i);
				r.getLa().adicion(x);
				
			}
			
			r=r.getSig();
		}
	}
	
	public static void iesimoArbol(LSimpleZ z,int i)
	{
		NodoZ q=z.getP();
		while(q!=null)
		{
			NodoA w=q.getLa().getP();
			int cont=0;
			while(w!=null)
			{
				cont+=1;
				if(cont==i)
					w.getA().mostrar();
				w=w.getSig();
			}
			q=q.getSig();
		}
	}

}
