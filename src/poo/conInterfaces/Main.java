package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

public class Main {
	
	static EmpleadoCRUD empleadoCRUD;
	
	public static void main(String[] args) {
		
		empleadoCRUD.verEmpleados();
		empleadoCRUD.guardar(new Empleado());
		
	}
	
}
