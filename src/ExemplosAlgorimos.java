import java.util.Scanner;
public class ExemplosAlgorimos {

	public static void main(String [] args) {
		
		
	int numeroDeAlunos = 3;
	
		 
			
		Scanner input = new Scanner(System.in);
		
		double valor1, valor2, media;
		
			System.out.println("Digite o valor da primeira nota:");
			valor1 = input.nextDouble();
			
			System.out.println("Digite o valor da segunda nota:");
			valor2 = input.nextDouble();
			
			media = (valor1+valor2)/2;
		
		if(media >= 7) {
			System.out.println("Parabéns, você está aprovado");
			System.out.println("Sua média é: " + media);
		} else
			if(media <= 7) {
			System.out.println("Você está reprovado");
			System.out.println("Sua média é: " + media);
		} 
		
	}
}
