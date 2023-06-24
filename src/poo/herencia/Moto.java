package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Moto extends Vehiculo {
	
	boolean baul;
	
	public Moto() {
		
	}

	public Moto(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
		super(fabricante, modelo, cc, year, sport, speed, motor);
		this.baul = baul;
	}
}
