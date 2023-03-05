package Vntas;

public abstract class Auto {
 private String marca;
 private String modelo;
 private int num_puertas;
 private String techo;
 private String color;
 private int capacidad;
 private String motor;
 private String tip_comb;
 private String frenos;
 private double costo;
 
 public Auto(int puertas, String techo, String color, int capacidad, String motor, String tipo_c, String frenos, double costo, String marca, String modelo){
	 this.num_puertas = puertas;
	 this.techo = techo;
	 this.color = color;
	 this.capacidad = capacidad;
	 this.motor = motor;
	 this.tip_comb = tipo_c;
	 this.frenos = frenos;
	 this.costo = costo;
	 this.marca = marca;
	 this.modelo = modelo;
 }
 
public String getMarca() {
	return marca;
}



public String getModelo() {
	return modelo;
}



public int getNum_puertas() {
	return num_puertas;
}



public String getTecho() {
	return techo;
}



public String getColor() {
	return color;
}



public int getCapacidad() {
	return capacidad;
}



public String getMotor() {
	return motor;
}



public String getTip_comb() {
	return tip_comb;
}



public String getFrenos() {
	return frenos;
}



public double getCosto() {
	return costo;
}

public String infoGeneral() {
	 String info;
	 info = "Marca/Modelo/Color "+ marca + " " + modelo + "/" + color  + "\n capacidad: " + capacidad + "\n Tipo techo: " + techo + "\n tipo de combustible: " + tip_comb + "\n Precio: " + costo;
	 return info;
}

public abstract String exhibicion();

public abstract void infoTecnica();

public abstract String clase();
 
 
}
