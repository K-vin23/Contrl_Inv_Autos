package Vntas;

public class Urbano extends Auto{
	private int cilindraje;
	private String subtipo;	
	
    public Urbano(int puertas, String techo, String color, int capacidad, String motor, String tipo_c, int cilindraje,
			String frenos, double costo, String marca, String modelo, String subtipo) {
		super(puertas, techo, color, capacidad, motor, tipo_c, frenos, costo, marca, modelo);
		this.subtipo = subtipo;
		this.cilindraje = cilindraje;
	}
    
    public int getCilindraje() {
		return cilindraje;
	}

	public String getSubtipo() {
		return subtipo;
	}

	@Override
	public void infoTecnica() {
		System.out.print(super.getMarca().toUpperCase() + " " + super.getModelo().toUpperCase() + "\n tipo: " + this.clase() + "\n # Puertas: " + super.getNum_puertas() + "\n Motor: " + super.getMotor() + "\n Tipo frenos: " + super.getFrenos());
	}

	@Override
	public String clase() {
		return "Urbano - " + subtipo;
	}

	@Override
	public String exhibicion() {
		return super.getMarca() + " " + super.getModelo() + " Clase: " + this.clase();
	}


}
