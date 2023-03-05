package Vntas;

public class Venta {
 private Auto auto;
 private Vendedor vendedor;
 private Cliente cliente;
 private int cuotas;
 private String fecha;
 
 public Venta(Auto auto, Vendedor vendedor, Cliente cliente, int cuotas, String fecha) {
		this.auto = auto;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.cuotas = cuotas;
		this.fecha = fecha;
	}
 
public String toString() {
	return "Auto: " + auto.infoGeneral() + "\nVendedor: " + vendedor.toString() + "\nCliente: " + cliente.toString() + "\n# Cuotas: " + cuotas + "\nFecha: "
			+ fecha;
}



public Auto getAuto() {
	return auto;
}

public Vendedor getVendedor() {
	return vendedor;
}

public Cliente getCliente() {
	return cliente;
}

public int getCuotas() {
	return cuotas;
}

public String getFecha() {
	return fecha;
}
 
 
 
}
