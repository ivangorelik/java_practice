
public class Conditionals {

	public static void main(String[] args) {
		Integer a = 5;
		Integer b = 101;
		
		if (a != b) {
			System.out.println("a no es igual que b");
		}
		
		if (a == b) {
			System.out.println("a es igual que b");
		} else {
			System.out.println("a no es igual que b");
		}
		
		if (a > b) {
			System.out.println("a es mayor que b");
		} else if (a < b) {
			System.out.println("a es menor que b");			
		} else {
			System.out.println("a es igual que b");						
		}
		
		
		Boolean exprResult = a > b;
		String exprVerdad = "Oh yeah";
		String exprFalso = "Oh noooo!";
		
		String r = a < b ? "Sí" : "No";
		
		String r2d2 = exprResult ?  exprVerdad : exprFalso;
		
		System.out.println(r);
		System.out.println(r2d2);
		
		Integer opc = 6;
		switch (opc) {
			case 1: System.out.println("Opción 1");
			break;
			case 2: System.out.println("Opción 2");
			break;
			case 6: System.out.println("Opción 6");
			System.out.println("Mandanga!");
			break;
			default: System.out.println("Opción no válida, capo.");;
		}
		
		/*
		&& and
		|| or
		! not
		xor no existe en java

		&
		|
		*/
		if (a > b && a > 1) {
			System.out.println("si , asi es");
		}
		
		if ( !(a > b && a > 1) || 1==1) {
			System.out.println("si , asi es");
		}
		
		Integer[] arr = new Integer[]{1, 2, 3};
		Integer i = 5;
		
		//if(i<arr.length & arr[i] > 0){
		if(i<arr.length && arr[i] > 0){
			System.out.println("si");
		}else{
			System.out.println("no");
		}
	}
	
	
}
