package snippet;

public class Professor extends Pessoa{
	
	double salario;
	
	double getInss() {
		return salario * 0.11;
	}
	
	double getSalarioLiquido() {
		return salario - getInss();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
