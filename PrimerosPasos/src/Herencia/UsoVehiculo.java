package Herencia;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		Coche miCoche1 = new Coche();
		
		miCoche1.setColor("Azul");
		
		Furgoneta miFurgoneta1 = new Furgoneta(500, 2);
		
		miFurgoneta1.setClimatizador("si");
		
		System.out.println(miFurgoneta1.getDatosFurgoneta());
		
		System.out.println(miCoche1.datosGenerales());
		
	}

}