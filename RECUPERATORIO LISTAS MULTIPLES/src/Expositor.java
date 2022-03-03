
public class Expositor {
	private String nomExp;
	private int telefono;
	public String getNomExp() {
		return nomExp;
	}
	public void setNomExp(String nomExp) {
		this.nomExp = nomExp;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void leer()
	{
		System.out.println("dig nomexp tel");
		nomExp=Leer.dato();
		telefono=Leer.datoInt();
	}
	
	public void mostrar()
	{
		System.out.print("["+nomExp+" , "+telefono+"]" );
	}

}
