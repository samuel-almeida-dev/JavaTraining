import java.util.Scanner;

public class ExemploString {

	public static void main(String[] args) {
		
		// String allows the insertion of a string of characters.
		
		String matricula, nome, situacao, turma;
		double teste, prova, media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a turma: ");
		turma = teclado.nextLine();
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("Digite a matricula do aluno: ");
			matricula = teclado.nextLine();
			
			System.out.println("Digite o nome do aluno: ");
			nome = teclado.nextLine();
			
			System.out.println("Digite a nota de teste do aluno: ");
			teste = teclado.nextDouble();
			
			System.out.println("Digite a nota de prova do aluno: ");
			prova = teclado.nextDouble();
			
			media = (teste+prova)/2;
			
			System.out.println("Matricula: " + matricula);
			System.out.println("Turma: " + turma);
			System.out.println("Nota média: " + media);
			
			if(media >= 7) {
				System.out.println("Aluno aprovado!");
				System.out.println("=================");
				System.out.println("Próximo aluno...");
			} else 
				if (media < 7) {
					System.out.println("Aluno reprovado!");
					System.out.println("=================");
					System.out.println("Próximo aluno...");
				}
		}
	}
}
