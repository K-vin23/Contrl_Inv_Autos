package Vntas;

public class Vendedor extends Persona{
	private String sucursal;
	private int vntas_mes;

	public Vendedor(String nombres, String apellidos, int identificacion, String sucursal) {
		super(nombres, apellidos, identificacion);
		this.sucursal = sucursal;
		this.vntas_mes = 0;
	}

	@Override
	public String toString() {
		return "Nombres: " + getNombres() + "\nApellidos: "
				+ getApellidos() + "\nIdentificacion: " + getIdentificacion() +  "\nSucursal: " + sucursal;
	}



	public String getSucursal() {
		return sucursal;
	}

	public int getVntas_mes() {
		return vntas_mes;
	}
	
	public void addVenta() {
		this.vntas_mes += 1;
	}
}
