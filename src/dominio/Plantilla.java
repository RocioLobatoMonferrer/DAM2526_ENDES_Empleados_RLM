package dominio;

import java.util.ArrayList;
import java.util.List;

public class Plantilla {
	List<Empleado> empleados;

	public Plantilla() {
		empleados = new ArrayList<>();
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	
	 public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
	 List<Empleado> aux = new ArrayList<>(); 
	 for (int i = 0; i < empleados.size(); i++) { 
		 if (empleados.get(i).getNombre() == filtroNombre.trim().toLowerCase() || empleados.get(i).getApellidos() == filtroNombre.trim().toLowerCase()) {
			 aux.add(filtroNombre); } else if (filtroNombre.isEmpty()) {
			 aux.add(empleados.get(i).getNombre() + empleados.get(i).getApellidos());
			} 
	 	}
	 }
	 return aux;
}
