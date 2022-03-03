import java.util.Scanner;

public class Facultad {
	private ABinarioC c;
	private String nombre;
	
	Facultad(){
		c = new ABinarioC();
		
	}
	public ABinarioC getC() {
		return c;
	}
	public void setC(ABinarioC c) {
		this.c = c;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void leer() {
		System.out.println("nombre - arbol");
		Scanner in = new Scanner(System.in);
		nombre = in.next();
		NodoC aux = new NodoC();
		c.setRaiz(aux);
		c.crear(c.getRaiz());
	}
	
	public void mostrar() {
		System.out.println("FACULTAD");
		System.out.println("Nombre: " + nombre);
		System.out.println("CARRERAS");
		c.mostrar(c.getRaiz());
		System.out.println();
	}
}
