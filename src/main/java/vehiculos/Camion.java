package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, 
				int peso, String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCantidadCamiones() {
		return Camion.cantidadCamiones;
	}
	
	public static void setCantidadCamiones(int cantidad) {
		Camion.cantidadCamiones = cantidad;
	}

}
