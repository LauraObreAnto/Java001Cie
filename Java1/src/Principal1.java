
public class Principal1 {

	public static void main(String[] args) {
		
		int n1=6;
		int n2=24;
		
		
		System.out.println("El numero mayor es " +numeroMayor(n1,n2));

	}
	
	public static int numeroMayor(int n1, int n2) {
		if (n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}

}
