
public class Principal6 {
	public static void main(String[] arg) {
	Persona p1=new Persona();
	p1.nombre="Paula";
	p1.edad=28;
	p1.altura=1.57;
	
	Persona p2=new Persona();
	p2.nombre="Manu";
	p2.edad=26;
	p2.altura=1.73;
	
	
	Persona[] alumnos= new Persona[] {p1,p2};
	for (int i=0;i<alumnos.length;i++) {
		System.out.println(alumnos[i].nombre);
		System.out.println(alumnos[i].edad);
		System.out.println(alumnos[i].altura);
	}
	
	

	}
	
}
	
