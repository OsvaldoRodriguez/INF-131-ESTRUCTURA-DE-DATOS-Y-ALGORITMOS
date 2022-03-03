
public class Artesania {
	private String nomArt,material;

	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void leer()
	{
		nomArt=Leer.dato();
		material=Leer.dato();
	}
	
	public void mostrar()
	{
		System.out.print("["+nomArt+" , "+material+"]");
	}

}
