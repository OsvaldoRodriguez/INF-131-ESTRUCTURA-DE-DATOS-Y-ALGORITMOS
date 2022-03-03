import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaC c = new PilaC();
		//c.llenar(Leer.datoInt());
		c.mostrar();
		
		for(int i = 0; i < 10; i++)
			c.eliminar();
		men(c);
	}
	public static void men(PilaC c) {
		int min = (1 << 30);
		PilaC aux = new PilaC();
		while(!c.esvacia()) {
			Calzado x = c.eliminar();
			min = Math.min(min, x.getNumero());
			aux.adicionar(x);
		}
		while(!aux.esvacia()) {
			Calzado x = aux.eliminar();
			if(x.getNumero() == min)
				x.mostrar();
			c.adicionar(x);
		}
	}
	public static void Sol1(PilaC a,String color) {
		PilaC x = new PilaC();
		PilaC y = new PilaC();
		while(!a.esvacia()) {
			Calzado b = a.eliminar();
			if(b.getColor().equals(color)) 
				x.adicionar(b);
			else
				y.adicionar(b);
		}
		a.vaciar(y);
		a.vaciar(x);
	}
	public static void agrupar(PilaC c) {
		PilaC aux = new PilaC();
		PilaC ans = new PilaC();
		while(!c.esvacia()) {
			Calzado tmp = c.eliminar();
			ans.adicionar(tmp);
			while(!c.esvacia()) {
				Calzado d = c.eliminar();
				if(d.getColor().equals(tmp.getColor())) {
					ans.adicionar(d);
				}else
					aux.adicionar(d);
			}
			c.vaciar(aux);
		}
		c.vaciar(ans);
	}
	
	public static void sort(PilaC c) {
		PilaC aux = new PilaC();
		PilaC ans = new PilaC();
		while(!c.esvacia()) {
			Calzado tmp = c.eliminar();
			while(!c.esvacia()) {
				Calzado y = c.eliminar();
				if(tmp.getNumero() < y.getNumero()) {
					aux.adicionar(tmp);
					tmp = y;	
				}else
					aux.adicionar(y);
			}
			ans.adicionar(tmp);
			c.vaciar(aux);
		}
		c.vaciar(ans);
	}

}
