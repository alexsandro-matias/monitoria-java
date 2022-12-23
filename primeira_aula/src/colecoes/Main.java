package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		 List<Aluno> listaAlunos = new ArrayList<>();
		 List<Professor> listaProfessores = new ArrayList<>();
		 Aluno aluno1 = new AlunoBolsista("Alexsandro", "1231231");
		 Aluno aluno2 = new AlunoBolsista("João", "4234234");
		 listaAlunos.add(aluno1);
		 listaAlunos.add(aluno2);
		 Professor professor1 = new Professor("Paulo Guedes", "465464");
		 Professor professor2 = new Professor("Anderson Moreira", "9878798");
		 listaProfessores.add(professor1);
		 listaProfessores.add(professor2);
		 Turma oo = new Turma("Programação Orientada a Objetos", listaAlunos, listaProfessores);
		 
		 System.out.println(oo);
	}
}
