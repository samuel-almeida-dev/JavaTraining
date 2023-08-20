package snippet;

public class Principal {

	public static void main(String[] args) {
		
		AlunoEnsinoMedio alunoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoSuperior = new AlunoEnsinoSuperior();
	
		
		alunoMedio.nome = "Lucas";
		alunoMedio.teste = 7;
		alunoMedio.prova = 8;
		
		System.out.println("Nome: " + alunoMedio.nome);
		System.out.println("Média: " + alunoMedio.getMedia());
	
		
		alunoSuperior.nome = "Michael";
		alunoSuperior.teste = 7;
		alunoSuperior.prova = 8;
		
		System.out.println("Nome: " + alunoSuperior.nome);
		System.out.println("Média: " + alunoSuperior.getMedia());
	}

}
