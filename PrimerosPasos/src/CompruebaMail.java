import javax.swing.*;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {

		int arroba = 0;
		boolean punto = false;
		
		
		String email = JOptionPane.showInputDialog("Introduce mail: ");
		
		for(int i = 0 ; i < email.length() ; i++) {
			
			if (email.charAt(i) == '@') {
				arroba++;
			}
			if(email.charAt(email.length()-3) == '.' || email.charAt(email.length()-4) == '.') {
				punto = true;
			}

		}
		if(arroba == 1 && punto) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}
		
	}

}
