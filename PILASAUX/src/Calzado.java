
public class Calzado {
	private String marca;
	private String color;
	private int numero;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void leer() {
		System.out.println("dig marca color num");
		marca = Leer.dato();
		color = Leer.dato();
		numero = Leer.datoInt();
	}
	public String toString() {
		return "Calzado [marca=" + marca + ", color=" + color + ", numero=" + numero + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
}
