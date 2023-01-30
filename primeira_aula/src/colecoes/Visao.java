package colecoes;

import java.util.Scanner;

public class Visao
{
	private Scanner leitor;
	
	public Visao()
	{
		leitor = new Scanner(System.in);
	}
	
	public Aluno criarAluno()
	{
		System.out.println("Por favor digite o nome do aluno:");
		String nome = "";
		nome = leitor.nextLine();
		System.out.println("Por favor digite a matrícula:");
		// String matricula= "";
		String matricula;
		// cuidado com erros de copy/paste
		matricula = leitor.nextLine();
		Aluno meuAluno = new Aluno(nome, matricula);
		return meuAluno;
	}
}
