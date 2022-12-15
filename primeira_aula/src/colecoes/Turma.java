package colecoes;

import java.util.ArrayList;

import monitoria.escola.Aluno;

public class Turma
{
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Professor> listaProfessores;
	
	public Turma(ArrayList<Aluno> listaAlunos, ArrayList<Professor> listaProfessores)
	{
		this.listaAlunos = listaAlunos;
		this.listaProfessores = listaProfessores;
	}
}
