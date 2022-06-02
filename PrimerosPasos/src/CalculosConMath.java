
public class CalculosConMath {

	public static void main(String[] args) {

		System.out.print("Calculo de la raíz de 9 \n");
		double raiz = Math.sqrt(9); 
		System.out.print(raiz + "\n");
		
		System.out.print("Redondeando un numero double con decimales: \n");
		double num1=5.8536;
		long resultado = Math.round(num1);
		System.out.print(resultado + "\n");
		
		System.out.print("Redondeando un numero float con decimales: \n");
		float num2=5.8536F; // Cuando se declaran variables de tipo float, al final del numero se pone F.
		int resultado2 = Math.round(num2);
		System.out.print(resultado2 + "\n");
		
		System.out.print("Refundición: \n");
		// ¿Que es la refundicion?
		// Lo que hace es convertir el tipo de dato que devuelve la operacion Math. ... y convertirlo al dato
		// que nosotros quremos (int).
		double num = 5.85;
		int resultado3 = (int)Math.round(num);
		System.out.print(resultado3 + "\n");
		
		
		System.out.print("Calculando un numero elevado a otro (5^3) \n");
		double base = 5;
		double exponente = 3;
		int resultado4 = (int)Math.pow(base, exponente);
		System.out.println("El resultado de "+base+" elevado a " + exponente + " es " + resultado4);
	
		}
		
	}



