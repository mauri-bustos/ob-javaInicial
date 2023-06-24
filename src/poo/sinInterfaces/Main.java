package poo.sinInterfaces;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
		
		Empleado juanito = new Empleado("Juan", 40, 40000, true);
		Empleado pato = new Empleado("Patricia", 23, 30000, true);
		Empleado pipo = new Empleado("Felipe", 33, 35000, true);
		
		
		// guardar empleados
		empleadoCRUD.guardar(juanito);
		empleadoCRUD.guardar(pipo);
		empleadoCRUD.guardar(pato);
		
		// consultar empleados
		
		List<Empleado> empleados = empleadoCRUD.verEmpleados();
		System.out.println(empleados.toString());
	}

}
