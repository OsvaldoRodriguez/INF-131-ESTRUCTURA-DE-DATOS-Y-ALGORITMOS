
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LSimpleU univ = new LSimpleU();
		for(int i = 0; i < 1; i++) {
			Universidad u = new Universidad();
			u.leer();
			univ.adicionar(u);
		}
		
		univ.mostrar();
		
		//a)
		System.out.println("a)\n");
		
//		univ.Univ_mas_carreras();
		
		//b)
		
		System.out.println("b");
		univ.falcultad_mas_carreras("umsa");
		
		//c)
		System.out.println("c");
		univ.univ_mas_estudiantes();
		
		// d)
		
		Carrera m = new Carrera();
		m.leer();
		univ.agregar_carrera(m, "fcpn", "umsa");
		univ.mostrar();
	}

}
