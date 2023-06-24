package poo.clases;

import poo.herencia.Moto;

public class Main {
	
	public static void main(String[] args) {
		
		//Clase indentificador = new Clase();
		//constructor sin parámetros
		Vehiculo toyotaPrius = new Vehiculo(); 
		
		//constructor de clase Motor para pasarlo como parámetro en el constructor de Vehiculo
		Motor motorGTI = new Motor("GIT", 190, 459.0, 6);
		Motor motorV = new Motor();
		
		//constructor con parámetros
		Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.0, 2023, true, 10, motorGTI); 		
		System.out.println(fordMondeo.fabricante);
		System.out.println(fordMondeo.year);
		fordMondeo.acelerar(50);
		fordMondeo.acelerar(70);
		
		Moto kawasaki = new Moto("Kawasaki", "Ninja", 750, 2023, true, 0, motorV, false);
		kawasaki.acelerar(220);
		
		System.out.println("Fin del programa");
		
		}
}
