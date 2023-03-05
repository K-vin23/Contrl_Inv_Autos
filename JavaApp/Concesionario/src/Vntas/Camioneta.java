package Vntas;

public class Camioneta extends Auto{
	
	private double peso;
	private String platon;
	private String transmision;
	private String subtipo;

	public Camioneta(int puertas, String techo, String color, int capacidad, String motor, String tipo_c,
			String frenos, double costo, String marca, String modelo, double peso, String platon, String subtipo, String transmision) {
		super(puertas, techo, color, capacidad, motor, tipo_c, frenos, costo, marca, modelo);
		this.peso = peso;
		this.platon = platon;
		this.subtipo = subtipo;
		this.transmision = transmision;
	}
	
	public double getPeso() {
		return peso;
	}

	public String getPlaton() {
		return platon;
	}

	public String getTransmision() {
		return transmision;
	}

	public String getSubtipo() {
		return subtipo;
	}

	@Override
	public void infoTecnica() {
		System.out.print(super.getMarca().toUpperCase() + " " + super.getModelo().toUpperCase() + "\n tipo: " + this.clase() + "\n # Puertas: " + super.getNum_puertas() + "\n Motor: " + super.getMotor() + "\n Tipo frenos: " + super.getFrenos() + "\n Peso Vehiculo: " + peso + "\n Transmision: " + transmision + "\n Tipo platon: " + platon);	
	}

	@Override
	public String clase() {
		
		return "Camioneta - " + subtipo;
	}

	@Override
	public String exhibicion() {
		return super.getMarca() + " " + super.getModelo() + "Clase: " + this.clase();
	}
	
}
