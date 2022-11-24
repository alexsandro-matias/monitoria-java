package monitoria.escola;

public interface Mestrando extends Bolsista
{
	
	@Override public default double valorFinalDaBolsa()
	{
		return Constants.BOLSA_MESTRADO;
	}
}
