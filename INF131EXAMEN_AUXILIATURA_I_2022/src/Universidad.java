import java.util.Scanner;

public class Universidad {
	private LSimpleF lf;
	private String nombre, departamento;
	
	Universidad(){
		lf = new LSimpleF();
	}
	
	public LSimpleF getLf() {
		return lf;
	}
	public void setLf(LSimpleF lf) {
		this.lf = lf;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("UNIVERSIDAD");
		System.out.println("nom  - dep - fac");
		nombre = in.next();
		departamento = in.next();
		System.out.println("cant de facultadaes");
		int cur = in.nextInt();
		for(int i = 0; i < cur; i++) {
			Facultad f = new Facultad();
			f.leer();
			lf.adicionar(f);
		}
	
	}
	
	public void mostrar() {
		System.out.println("UNIVERSIDAD ");
		System.out.println("NOMBRE: " + nombre);
		System.out.println("DEPARTAMENTO: " + departamento);
		lf.mostrar();
	}
	
	
}	
