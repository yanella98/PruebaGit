
public class EJEMPLO {
	
	public static void suma(){
		int numero1 = 4;
		int numero2 = 10;
		int total = numero1 + numero2;
		System.out.println(total);
	}
	
	public static void resta(){
		int numero1 = 4;
		int numero2 = 10;
		int total = numero1 - numero2;
		System.out.println(total);
	}
	
	public static void multiplicacion(){
		int numero1 = 4;
		int numero2 = 10;
		int total = numero1 * numero2;
		System.out.println(total);
	}
	public static void division(){
		int numero1 = 4;
		int numero2 = 10;
		int total = numero1 / numero2;
		System.out.println(total);
	}
	
	public static void elevado(){
		int numero1 = 4;
		int numero2 = 10;
		int total = (int) Math.pow(numero1, numero2);
		System.out.println(total);
	}

	public static void main(String[] args) {
		System.out.println("HOLA");
		suma();
		resta();
		multiplicacion();
		division();
		elevado();
	}

}
