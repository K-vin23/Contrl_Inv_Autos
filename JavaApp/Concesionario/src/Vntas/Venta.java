package Vntas;

public class Venta {
 private Auto auto;
 private Vendedor vendedor;
 private Cliente cliente;
 private int cuotas;
 private double valorcuota;
 private String fecha;
 
 public Venta(Auto auto, Vendedor vendedor, Cliente cliente, int cuotas, String fecha) {
		this.auto = auto;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.cuotas = cuotas;
		this.fecha = fecha;
	}
 
public String toString() {
	return "Auto: " + auto.infoGeneral() + "\nVendedor: " + vendedor.toString() + "\nCliente: " + cliente.toString() + "\n# Cuotas: " + cuotas + "\nValor cuota: " + valorcuota + "\nFecha: "
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

public void calcularCuotas(double intereses) {
	double porcentaje = intereses/100;
	double valorinteres = (porcentaje * auto.getCosto()) + auto.getCosto();
	double valorCuota =  valorinteres/cuotas;
	this.valorcuota = valorCuota;
}

public String getFecha() {
	return fecha;
}
 
 
 
}
