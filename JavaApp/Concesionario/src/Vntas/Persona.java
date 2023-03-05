package Vntas;

public class Persona {
 private String nombres;
 private String apellidos;
 private int Identificacion;
 
 public Persona(String nombres, String apellidos, int identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.Identificacion = identificacion;
	}

@Override
public String toString() {
	return "Nombres=" + nombres + "\nApellidos=" + apellidos + "\nIdentificacion=" + Identificacion;
}



public String getNombres() {
	return nombres;
}

public String getApellidos() {
	return apellidos;
}

public int getIdentificacion() {
	return Identificacion;
}
 
 
}
