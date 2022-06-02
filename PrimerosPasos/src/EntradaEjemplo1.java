import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in); // Creamos un metodo que se encarge de leer.
	System.out.print("Introduce tu nombre: ");
	
	String nombre_usuario = entrada.nextLine();
	
	System.out.println("Bienvenido " + nombre_usuario);
	
	}

}
