package escola;

import java.util.List;

public class RegistroAluno
{
	private List<Aluno> listaAlunos;
	private List<Professor> listaProfessores;
	private String nome;
	private static int codigoIteravelDoRegistro = 0;
	private int codigoRegistro;
	
	public RegistroAluno(String nome, List<Aluno> listaAlunos, List<Professor> listaProfessores)
	{
		this.listaAlunos = listaAlunos;
		this.listaProfessores = listaProfessores;
		this.nome = nome;
		codigoIteravelDoRegistro++;
		this.codigoRegistro = codigoIteravelDoRegistro;
	}
	
	public String impressaoAlunos()
	{
		String alunos = "";
		char aspas = '"';
		for (Aluno aluno : this.listaAlunos)
		{
			// alunos += listaAlunos + "";
			// alunos.replace('[', aspas);
			alunos += aspas + aluno.getNome() + aspas + "," + aspas + aluno.getCodigoAluno() + aspas + "," + aspas
					+ aluno.getMatricula() + aspas + "\n";
		}
		return alunos;
	}
	
	@Override public String toString()
	{
		return impressaoAlunos();
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
