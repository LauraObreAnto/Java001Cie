
public class Principal3 {

	public static void main(String[] args) {
		
		int[] lista=new int[] {2,5,6,7};
		for (int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
	}
		
	
		System.out.println("xxxxxxxxxxxx");
	 System.out.println(numeroMayor(lista));
		System.out.println("xxxxxxxxxxxx");
	 System.out.println(numeroMenor(lista));
	 System.out.println("xxxxxxxxxxxx");
	
	}
	
	public static int numeroMayor(int[] miArray) {
		int mayor=miArray[0];
		for (int i=0; i<miArray.length; i++) {
			if (miArray[i]> mayor){
				mayor= miArray[i]; 	}
			}
		return mayor;
	}

	public static int numeroMenor(int[] miArray) {
		int menor=miArray[0];
		for (int i=0; i<miArray.length; i++) {
			if (miArray[i]< menor){
				menor= miArray[i]; 	}
			}
		return menor;
	}
	

	}

