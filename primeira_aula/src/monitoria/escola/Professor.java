package monitoria.escola;

public class Professor extends Funcionario
{
	// construtor para AVA
	public Professor(String nomeProfessor, String matriculaProfessor)
	{
		nome = nomeProfessor;
		matricula = matriculaProfessor;
	}
	
	//Construtor para sistema de RH
	public Professor(String nomeProfessor, String matriculaProfessor, double salarioFuncionario)
	{
		nome = nomeProfessor;
		matricula = matriculaProfessor;
		salario = salarioFuncionario;
	}
	

	
}
