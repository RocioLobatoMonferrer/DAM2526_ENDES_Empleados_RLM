package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola implements IEntradaSalida {
	private Scanner sc;

	public Consola() {
		this.sc = new Scanner(System.in);
	}

	@Override
	public void imprimir(String texto) {
		System.out.print(texto);
	}

	@Override
	public void imprimirLinea(String texto) {
		System.out.println(texto);
	}

	@Override
	public String leerTexto(String mensaje) {
		String value = "";
		imprimirLinea(mensaje);
		do {
			value = sc.nextLine();
			if (value.trim().isEmpty()) {
				imprimirLinea(
						String.format("%sNo puedes introducir una cadena vacía, debe contener al menos un caracter.%s",
								"\u001B[31m", "\u001B[0m"));
			}
		} while (value.trim().isEmpty());
		return value;
	}

	@Override
	public int leerEntero(String mensaje) {
		int value = 0;
		boolean error;
		imprimirLinea(mensaje);
		do {
			try {
				value = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				imprimirLinea(String.format(
						"%sEl valor del integer debe ser de tipo númerico entero y comprendido entre el rango %d - %d.%s",
						"\u001B[31m", Integer.MIN_VALUE, Integer.MAX_VALUE, "\u001B[0m"));
				error = true;
			} finally {
			}
		} while (error);
		return value;
	}

	@Override
	public double leerimporte(String mensaje) {
		double value = 0;
		boolean error;
		imprimirLinea(mensaje);
		do {
			try {
				value = sc.nextDouble();
				error = false;
			} catch (InputMismatchException e) {
				imprimirLinea(String.format(
						"%sEl valor del integer debe ser de tipo númerico entero y comprendido entre el rango %d - %d.%s",
						"\u001B[31m", Integer.MIN_VALUE, Integer.MAX_VALUE, "\u001B[0m"));
				error = true;
			} finally {
			}
		} while (error);
		return value;
	}

	@Override
	public void mostrarMenu() {
		imprimirLinea("1 - Contratar empleado");
		imprimirLinea("2 - Listar todos los empleados");
		imprimirLinea("3 - Listar empleados con filtro");
		imprimirLinea("4 - Salir");
	}

	@Override
	public void limpiarPantalla() {

	}

	@Override
	public void pausa() {
	}

}
