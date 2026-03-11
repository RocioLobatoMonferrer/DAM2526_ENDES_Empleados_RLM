package app;

import dominio.Plantilla;

public class Main {
	public static void main(String[] args) {
		IEntradaSalida consola = new Consola();
		Plantilla plantilla = new Plantilla();
		GestorEmpleados gestor = new GestorEmpleados(consola, plantilla);

		gestor.ejecutar();
	}

}
