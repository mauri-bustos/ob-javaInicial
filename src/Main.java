
public class Main {
	
	public static void main(String[] args) {
		
		// Prueba de bucle while
		
		int count = 0;
		while(count < 10) {
			
			System.out.println(count + "numero");
			count++;
			
		}
		
		// Prueba constructor
		
		Coche coche1 = new Coche("Honda", "Civic", 1989);
		
		coche1.color = "Rojo";
		System.out.println(coche1.color + "" + coche1.marca);
		System.out.println(coche1.toString());
		System.out.println(coche1);
	}

}
