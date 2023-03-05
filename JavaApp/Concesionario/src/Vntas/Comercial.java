package Vntas;

public class Comercial extends Auto{
	
	private double capacidad_carga;
	private String subtipo;

	public Comercial(int puertas, String techo, String color, int capacidad, String motor, String tipo_c, String frenos, double costo, String marca, String modelo, double capacidad_c, String subtipo) {
		super(puertas, techo, color, capacidad, motor, tipo_c, frenos, costo, marca, modelo);
		this.capacidad_carga = capacidad_c;
		this.subtipo = subtipo;
	}

	public double getCapacidad_carga() {
		return capacidad_carga;
	}



	public String getSubtipo() {
		return subtipo;
	}



	@Override
	public void infoTecnica() {
		System.out.print(super.getMarca().toUpperCase() + " " + super.getModelo().toUpperCase() + "\n tipo: " + this.clase() + "\n # Puertas: " + super.getNum_puertas() + "\n Motor: " + super.getMotor() + "\n Tipo frenos: " + super.getFrenos() + "\n Capacidad de carga: " + capacidad_carga);
	}

	@Override
	public String clase() {
		return "Comercial - " + subtipo;
	}

	@Override
	public String exhibicion() {
		return super.getMarca() + " " + super.getModelo() + "Clase: " + this.clase();
	}

}
