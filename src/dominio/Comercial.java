package dominio;

public class Comercial extends Empleado {
	private double ventas;

	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getSueldo() {
		double result;
		result = sueldoBase + (ventas * 0.10);
		return result;
	}
}
