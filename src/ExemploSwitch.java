import java.util.Scanner;
public class ExemploSwitch {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		
			System.out.println("Digite um número de 1 a 4:");
			n = input.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("Você digitou 1");
			break;
		case 2:
			System.out.println("Você digitou 2");
			break;
		case 3:
			System.out.println("Você digitou 3");
			break;
		case 4:
			System.out.println("Você digitou 4");
			break;
			
		default:
			System.out.println("Você digitou um valor que não está no casos");
		
		}	
	}	
}
