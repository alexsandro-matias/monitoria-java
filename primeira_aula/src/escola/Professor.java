package escola;

public class Professor
{
	private String nome;
	private String matricula;
	private double salario;
	
	// construtor para AVA
	public Professor(String nomeProfessor, String matriculaProfessor)
	{
		this.nome = nomeProfessor;
		this.matricula = matriculaProfessor;
	}
	
	// Construtor para sistema de RH
	public Professor(String nomeProfessor, String matriculaProfessor, double salarioFuncionario)
	{
		this.nome = nomeProfessor;
		this.matricula = matriculaProfessor;
		this.salario = salarioFuncionario;
	}
	
	@Override public String toString()
	{
		return "Professor [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}
}
