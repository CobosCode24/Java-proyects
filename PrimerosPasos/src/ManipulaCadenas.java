
public class ManipulaCadenas {

	public static void main(String[] args) {

		String nombre = "CobosCode";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " Caracteres");
		
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("La ultima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1));
		
	}

}
