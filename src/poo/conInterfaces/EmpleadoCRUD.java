package poo.conInterfaces;

import java.util.List;

import poo.sinInterfaces.Empleado;

public interface EmpleadoCRUD {
	
	// solo declaran métodos, no los implementan
	
	void guardar(Empleado empleado);
	
	List<Empleado> verEmpleados();
	
	void borrar(Empleado empleado);

}
