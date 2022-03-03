
public class Nino {
	private String nombre;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	void leer()
	{
		nombre=Leer.dato();
		edad=Leer.datoInt();
	}
	
	void mostrar()
	{
		System.out.print("["+nombre+" "+edad+"] ");
	}
}
	