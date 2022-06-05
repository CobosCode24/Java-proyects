package poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche(); // Instanciar una clase. Ejemplar de clase.
									 // Creo un automovil renault con la estructura Coche.
		

		Renault.setClimatizador(JOptionPane.showInputDialog("¿ El coche tiene climatizador? "));
		Renault.setColor(JOptionPane.showInputDialog("Elige color"));		
		System.out.println("Datos generales: " + Renault.datosGenerales());
		
		System.out.println("Precio: "+Renault.precioCoche());
		
	}

}
 