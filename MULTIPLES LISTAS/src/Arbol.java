
public class Arbol {
	private String nombre;
	private int edad;
	private String ubicacion;
	private int cod,altura;
	
	
	
	
	
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void leer()
	{
		cod=Leer.datoInt();
		nombre=Leer.dato();
		edad=Leer.datoInt();
		ubicacion=Leer.dato();
		altura=Leer.datoInt();
	}
	
	public  void mostrar()
	{
		System.out.print("("+cod+" "+nombre+" "+edad+" "+ubicacion+" "+altura+") ");
	}
}
