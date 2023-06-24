import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		double numero1 = scanner.nextDouble();
		System.out.println("Introduce otro número");
		double numero2 = scanner.nextDouble();
		
		double resultado = suma(numero1, numero2);
		System.out.println(resultado);
		
		System.out.println("Ingrese el precio");
		double precio = scanner.nextDouble();
		double precioFinal = calcularIva(precio);
		System.out.println(precioFinal);
		
		System.out.println("FIN");
	}
	
	
	static double suma(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	static double calcularIva(double precio) {
		return precio + (precio * 0.21);
	}
	
}
