package poo.clases;

import poo.herencia.Moto;
import poo.herencia.Camion;
import poo.herencia.Coche;

public class Main {
	
	public static void main(String[] args) {
		
		// 1. clases y objetos
		// Clase indentificador = new Clase();
		// constructor sin parámetros
		Vehiculo toyotaPrius = new Vehiculo(); 
		
		// constructor de clase Motor para pasarlo como parámetro en el constructor de Vehiculo
		Motor motorGTI = new Motor("GIT", 190, 459.0, 6);
		Motor motorV = new Motor();
		
		// constructor con parámetros
		Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.0, 2023, true, 10, motorGTI); 		
		System.out.println(fordMondeo.fabricante);
		System.out.println(fordMondeo.year);
		fordMondeo.acelerar(50);
		fordMondeo.acelerar(70);
		
		// 2.herencia
		
		Moto kawasaki = new Moto("Kawasaki", "Ninja", 750, 2023, true, 0, motorV, false);
		kawasaki.acelerar(220);
		
		System.out.println("Fin del programa");
		
		//3. polimorfismo
		Vehiculo vehiculo;
		
		vehiculo = new Moto();
		vehiculo.acelerar(50);
		
		vehiculo = new Coche();
		vehiculo.acelerar(30);
		
		vehiculo = new Camion();
		vehiculo.acelerar(60);
		
		// 4. clases abstractas: no se pueden instanciar, solo se instancian las clases hijas
		
		}
}
