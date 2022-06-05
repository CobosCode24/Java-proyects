package Herencia;

public class Furgoneta extends Coche{ // Todo lo que tiene Coche, lo hereda Furgoneta
	
	private int capacidadExtra;
	private int plazaExtra;
	
	public Furgoneta(int capacidadExtra, int plazaExtra) {
		
		super(); // llama al constructor de la clase padre ( coche ).
		this.capacidadExtra=capacidadExtra;
		this.plazaExtra=plazaExtra;

	}


	public String getDatosFurgoneta() {
		return "La capacidad de la carga es: " + capacidadExtra + " y las plazas son: " + plazaExtra;
	}
	
}
