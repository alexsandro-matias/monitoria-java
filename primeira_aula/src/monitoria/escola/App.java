package monitoria.escola;

public class App
{
	public static void main(String[] args)
	{
		Aluno aluno = new Aluno();
		double valor = aluno.receberBolsa();
		System.out.println(valor);
	}
}
