import java.util.Scanner;

public class Estudiante {
	private int ci;
	private String apellido, nombre;
	
	
	public Estudiante(int ci, String apellido, String nombre) {
		this.ci = ci;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public Estudiante() {
		this.ci = 0;
		this.apellido = "";
		this.nombre = "";
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrar() {
		System.out.println("Estudiante");
		System.out.println("CI: " + ci);
		System.out.println("APELLIDO: " + apellido);
		System.out.println("NOMBRE: " + nombre);
		System.out.println();
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("ci - ap - nom");
		ci = in.nextInt();
		apellido = in.next();
		nombre = in.next();
	}
	
}
