package monitoria.escola;

public class Aluno implements BolsistaAtleta
{
	@Override public void setValorFinalDaBolsa(double novoValor)
	{
	}

	@Override public void escreverRelatorioParcial()
	{
		System.out.println("Aluno escrevendo relatório");
	}
	
	@Override public void competir()
	{
		System.out.println("Aluno competindo");
	}
	
	@Override public void treinar()
	{
	}
}
