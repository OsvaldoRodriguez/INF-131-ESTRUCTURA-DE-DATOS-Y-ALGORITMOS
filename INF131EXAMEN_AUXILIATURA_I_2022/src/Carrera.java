import java.util.Scanner;

public class Carrera {
	private String nombre;
	private int NroEstudiantes;
	
	Carrera(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroEstudiantes() {
		return NroEstudiantes;
	}
	public void setNroEstudiantes(int nroEstudiantes) {
		NroEstudiantes = nroEstudiantes;
	}
	
	public void mostrar() {
		System.out.println("CARRERA");
		System.out.println("Nombre: " + nombre);
		System.out.println("Nro Estudiante: " + NroEstudiantes);
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("nom - nroEst");
		nombre = in.next();
		NroEstudiantes = in.nextInt();
	}
	
}
