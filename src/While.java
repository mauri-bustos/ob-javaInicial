
public class While {

	public static void main(String[] args) {
		
		int contador = 0;
		int acumulador = 0;
		while (contador < 10) {
			contador ++;
			System.out.println("contador: " + contador);
			if (contador % 2 == 0) {
				continue;
			}
			acumulador += contador;
		}
		
		System.out.println(acumulador);
		
	}
	
}
