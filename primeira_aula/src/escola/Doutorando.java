
package escola;

public interface Doutorando extends Bolsista
{
	public default double valorFinalDaBolsa()
	{
		return Constants.BOLSA_DOUTORADO;
	}
}
