package colecoes;

public class Aluno
{
	private String nome;
	private String matricula;

	public Aluno(String nomeAluno, String matriculaAluno)
	{
		this.nome = nomeAluno;
		this.matricula = matriculaAluno;
	}

	@Override public String toString()
	{
		return "Aluno [nome	=" + this.nome + ", matricula=" + this.matricula + "]";
	}
}
