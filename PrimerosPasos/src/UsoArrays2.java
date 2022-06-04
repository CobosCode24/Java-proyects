import javax.swing.*;
public class UsoArrays2 {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		for(int i = 0 ; i<paises.length ; i++) {
			
			paises[i] = JOptionPane.showInputDialog("Introduce país" + (i+1));
			
		}
		
		for(String elemento:paises){

			System.out.println(elemento);
			
		}

	}

}
