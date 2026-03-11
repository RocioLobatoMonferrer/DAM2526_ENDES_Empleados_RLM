package app;

public interface IEntradaSalida {
	public void imprimir(String texto);

	public void imprimirLinea(String texto);

	public String leerTexto(String mensaje);

	public int leerEntero(String mensaje);

	public double leerimporte(String mensaje);

	public void mostrarMenu();

	public void limpiarPantalla();

	public void pausa();
}
