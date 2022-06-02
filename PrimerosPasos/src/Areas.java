import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1. Cuadrado \n2. Rectángulo \n3. Triángulo\n4. Círculo\n");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
			case 1: 
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
				
				System.out.println("El area del cuadrado es: " + (Math.pow(lado, 2)));
				
				break;
				
			case 2: 
				int Base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
				int Altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
				System.out.println("El area del rectangulo es: " + (Base*Altura));
				
				break;
			
			case 3: 
				Base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
				Altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
				System.out.println("El area del triangulo es: " + ((Base*Altura)/2));
				
				break;
			
			case 4: 

				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));

				System.out.println("El area del circulo es: ");
				System.out.printf("%1.2f", (Math.PI*(Math.pow(radio, 2))));
				
				break;
			
			default:
				System.out.println("Opción incorrecta...");

		}
		
	}

}
