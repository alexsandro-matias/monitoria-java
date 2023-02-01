package colecoes;

import java.util.List;

public class Turma
{
	private List<Aluno> listaAlunos;
	private List<Professor> listaProfessores;
	private String nome;
	private int codigo;
	
	public Turma(String nome, List<Aluno> listaAlunos, List<Professor> listaProfessores)
	{
		this.listaAlunos = listaAlunos;
		this.listaProfessores = listaProfessores;
		this.nome = nome;
	}
	
	@Override public String toString()
	{
		return "Turma: " + getNome() + " - " + "Código - " + this.codigo + "\n" + listaAlunos + ", listaProfessores="
				+ listaProfessores + "]";
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
}
