package Vntas;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//Listas
		ArrayList<Auto> autos = new ArrayList<>();
		ArrayList<Vendedor> vendedores = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Venta> ventas = new ArrayList<>();
		
		//Objetos
		Auto autom;
		Vendedor vend;
		Cliente cl;
		Venta vent;
		
		//Variables de Menu
		int opcion;
		String busqueda;
		String resultado = "";
		
		//variables Personas
		 String nombre;
		 String apellido;
		 int identificacion;
		 String telefono;
		 String correo;
		 
		//variables Auto
		 String modelo;
		 String marca;
		 int num_puertas;
		 String techo;
		 String color;
		 int capacidad;
		 String motor;
		 String tip_comb;
		 String frenos;
		 double costo;
		 
		//Scaner
		Scanner sc = new Scanner(System.in);
		
		//Salidas
		boolean psalir = false;
		boolean salir1 = false;
		boolean salir2 = false;
		
		//PRUEBAS
		vend = new Vendedor("Fabian", "Cardoso", 1212889183, "Cali - Motorspot");
		autom = new Urbano(4, "rigido", "azul", 4, "Nosexd", "Diesel", 121, "Disco", 12000, "Mitsubishi", "Lancer", "Sedan");
		vendedores.add(vend);
		autos.add(autom);
		
		while(psalir == false) { //Principal
		
		//Menu Principal
		System.out.println("Bienvenido, ¿qué deseas hacer?");
		System.out.println("1. Ver lista de autos" + "\n2. Registrar Venta" + "\n3. Salir");
		opcion = sc.nextInt();
		
		
		switch(opcion) { //Opciones Autos
		 case 1: 
			 
			 while(salir1 == false) {
			 
			 opcion = 0;
			 System.out.println("1. Lista completa  \n2. Filtrar lista \n3. Busqueda \n4. Modificar Lista \n5. Salir");
			 opcion = sc.nextInt();
			 
			 switch(opcion) { //Opciones de Lista
			 case 1:	//Lista Completa
				 String info = "";
				 if(autos.isEmpty()) {
					 System.out.println("No hay autos registrados.");
				 }
				 for(Auto a : autos) {
					info += a.exhibicion();
				 }
				 System.out.println(info);
				 
			  break;
			 case 2:	//Filtros
				 opcion = 0;
				 System.out.println("1. Por Marca  \n 2.Por Clase");
				 opcion = sc.nextInt();
				 sc.nextLine();
				 System.out.println("Buscar: ");
				 busqueda = sc.next();
				 
				 if(opcion == 1) {
					 for(Auto au : autos) {
						 if(au.getMarca().contains(busqueda)) {
							 resultado += au.exhibicion();
						 } 
					 }
					 
				}else if(opcion == 2) {
					for(Auto au : autos) {
						 if(au.clase().contains(busqueda)) {
							 resultado += au.exhibicion();
						 } 
					 }
					
				}else {
					System.out.println("opcion no valida");
				}
				 
				System.out.println(resultado);
				 
			  break;
			 case 3:	//Busqueda
				 sc.nextLine();
				 System.out.println("Buscar: ");
				 busqueda = sc.next();
				 
				 for(Auto au : autos) {
					 if(au.exhibicion().contains(busqueda)) {
						 resultado += au.exhibicion();
					 } 
				 }
				 System.out.println(resultado);
			  break;
			 case 4:
				 System.out.println("1. Agregar  \n2. Eliminar");
				 int opcion2 = sc.nextInt();
				 sc.nextLine();
				 switch(opcion2) {
				 case 1:
					 System.out.println("Marca: ");
					 marca = sc.next();
					 System.out.println("Modelo: ");
					 modelo = sc.next();
					 System.out.println("# puertas: ");
					 num_puertas = sc.nextInt();
					 System.out.println("Tipo de techo: ");
					 techo = sc.next();
					 System.out.println("Color: ");
					 color = sc.next();
					 System.out.println("Capacidad: ");
					 capacidad = sc.nextInt();
					 sc.nextLine();
					 System.out.println("Motor: ");
					 motor = sc.next();
					 System.out.println("Tipo de combustible: ");
					 tip_comb = sc.next();
					 System.out.println("Tipo de Frenos: ");
					 frenos = sc.next();
					 System.out.println("Precio: ");
					 costo = sc.nextDouble();
					 sc.nextLine();
					 opcion2 = 0;
					 
					 System.out.println("Clase de auto: \n1. Urbano \n2. Deportivo \n3. Camioneta \n4. Comercial");
					 opcion2 = sc.nextInt();
					 
					 if(opcion2 == 1) {
						 System.out.println("Cilindraje: ");
						 int cilindraje = sc.nextInt();
						 System.out.println("Subtipo: ");
						 String subtipo = sc.next();
						 autom = new Urbano(num_puertas, techo, color, capacidad, motor, tip_comb, cilindraje,
									frenos, costo, marca, modelo, subtipo);
						 
					 }else if(opcion2 == 2) {
						 System.out.println("Caballos de fuerza: ");
						 double cab_fuerza = sc.nextDouble();
						 System.out.println("Subtipo: ");
						 String subtipo = sc.next();
						 autom = new Deportivo(num_puertas, techo, color, capacidad, motor, tip_comb,
									frenos, costo, marca, modelo, cab_fuerza, subtipo);
						 
					 }else if(opcion2 == 3) {
						 System.out.println("Peso: ");
						 double peso = sc.nextDouble();
						 System.out.println("Platon: ");
						 String platon = sc.next();
						 System.out.println("Transmision: ");
						 String transmision = sc.next();
						 System.out.println("Subtipo: ");
						 String subtipo = sc.next();
						 autom = new Camioneta(num_puertas, techo, color, capacidad, motor, tip_comb,
									frenos, costo, marca, modelo, peso, platon, subtipo, transmision);
						 
					 }else if(opcion2 == 4) {
						 System.out.println("Capacidad de carga: ");
						 double carga = sc.nextDouble();
						 System.out.println("Subtipo: ");
						 String subtipo = sc.next();
						 autom = new Comercial(num_puertas, techo, color, capacidad, motor, tip_comb,
									frenos, costo, marca, modelo, carga, subtipo);
						 
					 }
					 
					break;
				 case 2:
					 System.out.println("Eliminar (Marca y modelo) (ej: Ford Focus rs): ");
					 busqueda = sc.next();
					 sc.nextLine();
					 for(int i=0; i<autos.size(); i++) {
						 if(autos.get(i).exhibicion().contains(busqueda)) {
							 autos.remove(i);
						 }
					 }
					break;
				 }
				 
			  break;
			 case 5:
				   salir1 = true;
				   
			  break;
			 default:
				 
				 System.out.println("opcion no valida");
			 }
		   } 

		 break;
		 case 2:	//Venta
			 
			 while(salir2 == false) {
			 
			 //variables
			 opcion = 0;
			 int seleccion;
			 int cuotas;
			 String fecha;
			 boolean encontrado = false;
			 
			 //Auto
			 System.out.println("1 - seleccionar el auto  \n1. Lista completa \n2.buscar \n3. salir");
			 opcion = sc.nextInt();
			 sc.nextLine();
			 
			 if(opcion == 1) {	//Lista Completa
				 if(autos.isEmpty()) {
					 System.out.println("No hay autos registrados.");
				 }
				 for(int i=0; i<autos.size(); i++) {
					 resultado += i + ". " + autos.get(i).exhibicion();
				 }
					 System.out.println(resultado);
					 System.out.println("Numero de seleccion: ");	
			 seleccion = sc.nextInt();
			 sc.nextLine();
			 
			 autom = autos.get(seleccion); 	//Auto seleccionado
					 
			 }else if(opcion == 2) {	//Busqueda
				 busqueda = sc.next();
				 for(Auto au : autos) {
					 if(au.exhibicion().contains(busqueda)) {
						 autom = au;
						 encontrado = true;
					 }
				 }
				 if(autos.isEmpty()) {
					 System.out.println("No hay autos registrados.");
				 }
				 
				 if(encontrado == true) {
					 System.out.println(resultado);
				 }else {
					 System.out.println("No encontrado");
				 }
					 
			 }else if(opcion == 3){
				 salir2 = true;
				 
			 }else {
				 System.out.println("opcion no valida");
				 
			 }
			 
			 //Vendedor
			 System.out.println("2 - Vendedor quien la realiza \n identificacion:");
			 identificacion = sc.nextInt();
			 sc.nextLine();
			 for(Vendedor v : vendedores) {
				 if(v.getIdentificacion() == identificacion) {
					 vend = v;
					 resultado = v.getNombres() + " " + v.getApellidos();
					 encontrado = true;
				 }
			 }
			 
			 if(encontrado == true) {
				 System.out.println(resultado);
			 }else {
				 System.out.println("No encontrado");
				 System.out.println("¿Desea registrar el vendedor? \n1.Registrar \n2.Volver");
				 int opcion1 = sc.nextInt();
				 if(opcion1 == 1) {
					 System.out.println("Nombres:");
					 nombre = sc.next();
					 System.out.println("Apellidos:");
					 apellido = sc.next();
					 System.out.println("Sucursal:");
					 String sucursal = sc.next();
					 vend = new Vendedor(nombre, apellido, identificacion, sucursal);
					 vendedores.add(vend);
				 }
			 }
			 
			 //Cliente
			 cl = null;
			 System.out.println("3 - Cliente \n Identificacion:");
			 identificacion = sc.nextInt();
			 sc.nextLine();
			 for(Cliente c : clientes) {
				 if(c.getIdentificacion() == identificacion) {
					 cl = c;
					 encontrado = true;
				 }
			 }
			 if(encontrado == true) {
				 System.out.println("El cliente ya se encuentra registrado");
				 System.out.println("agregando datos .");
				 System.out.println(". . . .");
			 }else {
				 System.out.println("Nombres:");
				 nombre = sc.next();
				 System.out.println("Apellidos:");
				 apellido = sc.next();
				 System.out.println("Telefono:");
				 telefono = sc.next();
				 System.out.println("Correo:");
				 correo = sc.next();
				 cl = new Cliente(nombre, apellido, identificacion, telefono, correo);
				 clientes.add(cl);
			 }
			 
			 //Cuotas
			 System.out.println("4 - Cuotas \n#Cuotas Pago:");
			 cuotas = sc.nextInt();
			 sc.nextLine();
			 
			 //Fecha
			 System.out.println("5 - Fecha venta \nFecha:");
			 fecha = sc.next();
			 
			 vent = new Venta(autom, vend, cl, cuotas, fecha);
			 ventas.add(vent);
			 
			 System.out.println("¿Desea registrar otra venta? \n1. Continuar \n2. Salir");
			 opcion = sc.nextInt();
			 
			 if(opcion == 2) {
				 salir2 = true;
			 }
			 
		   } 
		 break;
		 case 3:
			 psalir = true;
		 break;
		 default:
			 System.out.println("Opcion no valida");
		}
	   }
		
		sc.close();
	}

}
