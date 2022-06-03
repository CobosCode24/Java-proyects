import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		
		String clave = "123456789";
		
		String pass = "";
		
		while(clave.equals(pass) == false) { 	// comparamos si la clave es igual a pass, como es falso entonces entra.
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña...");			
			
			if(clave.equals(pass) == false) {
				
				System.out.println("Contraseña incorrecta...");
				
			} else {
				
				System.out.print("Contraseña correcta, acceso permitido...");
				
			}
			
		}
		
	}

}
