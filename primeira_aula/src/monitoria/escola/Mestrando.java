package monitoria.escola;

public interface Mestrando extends Bolsista
{
	
	@Override public default double ValorFinalDaBolsa()
	{
		return Constants.BOLSA_MESTRADO;
	}
}
