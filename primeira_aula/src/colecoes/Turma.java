package colecoes;

import java.util.ArrayList;

public class Turma
{
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Professor> listaProfessores;
	
	public Turma(ArrayList<Aluno> listaAlunos, ArrayList<Professor> listaProfessores)
	{
		this.listaAlunos = listaAlunos;
		this.listaProfessores = listaProfessores;
	}
	
	
	
	

	@Override public String toString()
	{
		return "Turma [listaAlunos=" + listaAlunos + ", listaProfessores=" + listaProfessores + "]";
	}
	
	
}
