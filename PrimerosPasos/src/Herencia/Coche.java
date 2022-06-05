package Herencia;

public class Coche {

	private int ruedas; // 'private' es para que el valor que se le asigna a las 
						// ruedas en el constructor, no se puedan modificar desde otra clase.
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private int asientos;
	private boolean climatizador;
	
	// Los metodos constructores siempre tienen que tener el mismo nombre.
	public Coche(){
		
		ruedas = 4;
		largo = 200;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	
	public String getLargo() {
		return "El largo del coche es: " + largo;
	}
	
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	public void setColor(String colorNuevo) {
		color = colorNuevo;
	}
	
	public String getColor() {
		return "El color del coche es: "+color;
	}
	
	public String datosGenerales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. "
				+ "Mide "+ largo/100 + " metros y con un ancho de " + ancho + 
				" cm y un peso de la plataforma de " + pesoPlataforma + " Kg."
				+ " Tiene color " + color + "." + " El peso total del coche es "
				+ dime_peso_coche();
	}
	
	public String getClimatizador() {
		return "Climatizador: "+ climatizador;
	}
	
	public void setClimatizador(String tieneClimatizador) {
		
		if(tieneClimatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
		
	}
	
	public String dime_peso_coche() {
		
		int peso_carroceria = 500;
		pesoTotal = pesoPlataforma+peso_carroceria;
		
		if(climatizador==true) {
			pesoTotal += 20;
		}
		return "El peso del coche es "+ pesoTotal;
	}
	
	public int precioCoche() {
		
		int precioFinal = 1000;
		
		if(climatizador==true) {
			precioFinal += 100;
		} 
		
		
		return precioFinal;
	}
	
	
	
	
	
	
	
	
/*----------------------------------------------------------------------------*/	

	/*
	public static void main(String args[]) {
		
		Coche Renault = new Coche(); // Instanciar una clase. Ejemplar de clase.
		 							 // Creo un automovil renault con la estructura Coche.

		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
	}
	*/
	
}

/* NO ACONSEJADO !!!

class Camion{
	
}

class Moto{
	
}
*/
