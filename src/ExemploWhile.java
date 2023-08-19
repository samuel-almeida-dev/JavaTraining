import java.util.Scanner;

public class ExemploWhile {

	// Occurs when we don't know the number of times of N.
	
	public static void main(String [] args) {

		//int number = 10;
		
		// Check condition before execution (While)
		
		//while(number <= 100 ) {
		//System.out.println(number);
		//number++;
		//}
		
		// Run first before testing (Do - While)
		
		//do {
		//System.out.println(number);
		//number++;
		//} while(number <= 20);
		
		//Selection menu example;
		
		Scanner teclado = new Scanner(System.in);
	
		int op;
		
		do {
			
			System.out.println("--------------");
			System.out.println("Menu Principal");
			System.out.println("--------------");
			System.out.println("Selecione umas das opções abaixo");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Coordenador");
			System.out.println("0 - Sair");
			
			System.out.println("Qual opção desejada: ");
			op = teclado.nextInt();

			switch(op) {
			
			case 1: 
				System.out.println("Bem vindo ao portal do Aluno.");
				break;
			case 2: 
				System.out.println("Bem vindo ao portal do Professor.");
				break;
			case 3: 
				System.out.println("Bem vindo ao portal do Coordenador.");
				break;
			default:
				System.out.println("Opção de saída.");
				}
		}while(true);

	}
}