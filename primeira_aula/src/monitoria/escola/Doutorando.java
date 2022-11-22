package monitoria.escola;

public interface Doutorando
{
	public default double ValorFinalDaBolsa()
	{
		return Constants.BOLSA_DOUTORADO;
	}
}
