
public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		int [][] matrix = {
				{10, 15, 18, 19, 21},
				{5, 8, 9, 6, 7, 10},
				{10, 4, 5, 6, 7, 8},
				{3, 7, 3, 9, 10, }
		};
/*		
		for (int i=0 ; i<4 ; i++) {
			System.out.println();
			for(int j=0 ; j<5 ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
*/
		// bucle for each
		for(int[] fila:matrix ) {
			
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z + " ");
				
			}
			
		}
		
	}

}


