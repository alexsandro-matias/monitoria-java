package escola;

public class Aluno
{
	private String nome;
	private String matricula;
	private int codigoAluno;
	private static int codigo = 0; 

	public Aluno(String nomeAluno, String matriculaAluno)
	{
		this.nome = nomeAluno;
		this.matricula = matriculaAluno;
		codigoAluno = codigo++;
	}

	@Override public String toString()
	{
		return "Aluno [nome	=" + this.nome + ", Código=" + this.codigoAluno + "]";
	}
}
