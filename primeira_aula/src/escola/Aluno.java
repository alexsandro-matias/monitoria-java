package escola;

public class Aluno
{
	private String nome;
	private String matricula;
	private static int codigoIteravelAluno = 0;
	private int codigoAluno;
	
	public Aluno(String nomeAluno, String matriculaAluno)
	{
		this.nome = nomeAluno;
		this.matricula = matriculaAluno;
		codigoIteravelAluno++;
		codigoAluno = codigoIteravelAluno;
	}
	
	@Override public String toString()
	{
		return getMatricula() + "," + getNome() + "\n";
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getMatricula()
	{
		return matricula;
	}
	
	public int getCodigoAluno()
	{
		return codigoAluno;
	}
}
