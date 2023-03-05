package Vntas;

public class Deportivo extends Auto{
	private double cab_fuerza;
	private String subtipo;

	public Deportivo(int puertas, String techo, String color, int capacidad, String motor, String tipo_c,
	 String frenos, double costo, String marca, String modelo, double cab_fuerza, String subtipo) {
		super(puertas, techo, color, capacidad, motor, tipo_c, frenos, costo, marca, modelo);
		this.cab_fuerza = cab_fuerza;
		this.subtipo = subtipo;
	}

	public double getCab_fuerza() {
		return cab_fuerza;
	}



	public String getSubtipo() {
		return subtipo;
	}



	@Override
	public void infoTecnica() {
		System.out.print(super.getMarca().toUpperCase() + " " + super.getModelo().toUpperCase() + "\n tipo: " + this.clase() + "\n # Puertas: " + super.getNum_puertas() + "\n Motor: " + super.getMotor() + "\n Tipo frenos: " + super.getFrenos() + "\n Caballos de fuerza: " + cab_fuerza);	
	}

	@Override
	public String clase() {	
		return "Deportivo - " + subtipo;
	}

	@Override
	public String exhibicion() {
		return super.getMarca() + " " + super.getModelo() + "Clase: " + this.clase();
	}

}
