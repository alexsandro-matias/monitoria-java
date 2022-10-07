package primeira_aula;

public class Funcionario {
	int matricula;
	String nome;
	String escolaridade;
	double salario;

	public Funcionario(double salario, String nome) {
		super();
		this.salario = salario;
		this.nome = nome;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}


}