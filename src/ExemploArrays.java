import java.util.Scanner;
public class ExemploArrays {

	public static void main(String[] args) {
		
		int [][] matriz = new int [2][3];
		int i, j;
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 1;
		matriz[1][0] = 2;
		matriz[1][1] = 1;
		matriz[1][2] = 2;
		
		for (i = 0; i < 2 ;i++) {
			for (j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
	}
	
}
