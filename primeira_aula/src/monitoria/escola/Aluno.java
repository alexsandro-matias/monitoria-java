package monitoria.escola;

public class Aluno implements Bolsista
{
	private Bolsista bolsista;
	
	
	@Override public double valorFinalDaBolsa()
	{
		return this.bolsista.valorFinalDaBolsa();
	}
}
