package monitoria.escola;

public class Aluno implements Mestrando, Doutorando, Bolsista
{
	private Bolsista bolsista;
	
	public Aluno(Bolsista bolsista)
	{
		super();
		this.bolsista = bolsista;
	}
	
	@Override public double ValorFinalDaBolsa()
	{
		return Doutorando.super.ValorFinalDaBolsa();
	}
}
