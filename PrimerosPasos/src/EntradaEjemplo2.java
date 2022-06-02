import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		
		String NombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre: ");

		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		
		int edadUsuario = Integer.parseInt(edad); // Para pasar de un string a un int.
		
		System.out.println("Hola " + NombreUsuario + ". El año que viene tendrás " + 
						   (edadUsuario+1) + " años.");
		
	}

}
