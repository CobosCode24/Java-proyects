import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {

		int numAleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, intentos = 0;
		
		do{
			
			intentos++;
			
			System.out.println("Introduce un numero...");
			
			numero = entrada.nextInt();
			
			if(numAleatorio < numero) {
				
				System.out.println("Mas bajo");
				
			} else if(numAleatorio > numero) {
				
				System.out.println("Mas alto");
				
			} else {
				
				System.out.println("Número correcto");
				
			}
			
		}while(numero != numAleatorio);
		
		System.out.println("Lo has logrado en " + intentos + " intentos");
		
	}

}
