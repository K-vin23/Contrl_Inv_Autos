package Vntas;

public class Cliente extends Persona{
	private String telefono;
	private String correo;

	public Cliente(String nombres, String apellidos, int identificacion, String telefono, String correo) {
		super(nombres, apellidos, identificacion);
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public String toString() {
		return "Nombres: " + getNombres() + "\nApellidos: "
				+ getApellidos() + "\nIdentificacion: " + getIdentificacion() +  "\nTelefono: " + telefono + "\nCorreo: " + correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

}
