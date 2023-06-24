package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public class EmpleadoCRUD {
	
	// estructura de datos
	
	List<Empleado> empleados = new ArrayList<>();
	
	// Operaciones CRUD
	
	// CREATE - método para gurdad un empleado
	public void guardar(Empleado empleado) {
		empleados.add(empleado);
	}
	
	// recuperar empleados
	public List<Empleado> verEmpleados() {
		return empleados;
	}

}
