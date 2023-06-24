
public class For {

	public static void main(String[] args) {
		
		int acumulador = 0;
		for(int i = 0; i <= 5; i++ ) {
			acumulador = acumulador + i;
		}
		System.out.println(acumulador);
		
		// recorriendo un Array con for
		int[] numeros1 = {1,2,3,4,5};
		
		for(int i = 0; i < numeros1.length; i++) {
			System.out.println("entrada: " + i);
			acumulador += numeros1[i];
		}
		System.out.println("Esto debería dar 30: " + acumulador);
		
		
		// recorriendo un Array con forEach
		int[] numeros2 = {1,2,3,4,5};
		
		int resultado = 0;
		for (int numero : numeros2) {
			resultado = resultado + numero;
		}
		System.out.println(resultado);
		
		
	}
	
}
