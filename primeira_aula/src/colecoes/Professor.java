package colecoes;

import monitoria.escola.Funcionario;

public class Professor extends Funcionario
{
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
}
