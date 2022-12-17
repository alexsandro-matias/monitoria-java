package colecoes;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Professor> listaProfessores = new ArrayList<>();
		Aluno aluno1 = new Aluno("Alexsandro", "1231231");
		Aluno aluno2 = new Aluno("João", "4234234");
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		Professor professor1 = new Professor("Paulo Guedes", "465464");
		Professor professor2 = new Professor("Anderson Moreira", "9878798");
		listaProfessores.add(professor1);
		listaProfessores.add(professor2);
		Turma oo = new Turma(listaAlunos, listaProfessores);
		System.out.println(oo);
		System.out.println(listaProfessores.size());
	}
}
