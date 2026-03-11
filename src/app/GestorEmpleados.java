package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dominio.Comercial;
import dominio.Empleado;
import dominio.Plantilla;
import dominio.Tecnico;

public class GestorEmpleados {
	IEntradaSalida consola;
	Plantilla plantilla;

	public GestorEmpleados(IEntradaSalida consola, Plantilla plantilla) {
		this.consola = consola;
		this.plantilla = plantilla;
	}

	public void ejecutar() {
		consola.mostrarMenu();
		int option = consola.leerEntero("Introduce una de las opciones");
		do {
			switch (option) {
			case 1 -> {
				contratarEmpleado();
			}
			case 2 -> {
				listarTodos();
			}
			case 3 -> {
				listarPorFiltro();
			}
			case 4 -> {
				consola.imprimirLinea("Saliendo...");
			}
			}

		} while (option != 4);
	}

	private void contratarEmpleado() {
		Tecnico tec;
		Comercial com;
		String dni, nombre, apellidos;

		double sueldoBaseCom = 800;
		double sueldoBaseTec = 1000;

		int categoria = 0;
		int option;

		option = consola.leerEntero("1- Técnico\n2- Comercial");
		if (option == 1) {
			dni = consola.leerTexto("DNI: ");
			nombre = consola.leerTexto("Nombre: ");
			apellidos = consola.leerTexto("Apellidos: ");
			++categoria;

			tec = new Tecnico(dni, nombre, apellidos, sueldoBaseTec, categoria);

			plantilla.agregarEmpleado(tec);

		} else if (option == 2) {
			dni = consola.leerTexto("DNI: ");
			nombre = consola.leerTexto("Nombre: ");
			apellidos = consola.leerTexto("Apellidos: ");

			com = new Comercial(dni, nombre, apellidos, sueldoBaseCom);
			plantilla.agregarEmpleado(com);
		}

	}

	private void listarTodos() {
		List<Empleado> empleados = new ArrayList<>();

	}

	private void listarPorFiltro() {
		List<Empleado> empleados = new ArrayList<>();

	}

	private void listarEmpleados(List<Empleado> empleados) {

	}

	private void ordenarPorNombre(List<Empleado> empleados) {
		Collections.sort(empleados, Comparator.comparing(Empleado::getNombre));
	}
}
