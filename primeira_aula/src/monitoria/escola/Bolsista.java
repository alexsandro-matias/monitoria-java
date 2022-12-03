package monitoria.escola;

public interface Bolsista
{
	/**
	 * Define o valor da bolsa.
	 * 
	 * @param novoValor
	 */
	public void setValorFinalDaBolsa(double novoValor);
	
	/**
	 * Retorna o valor da bolsa.
	 * 
	 * @return
	 */
	public double receberBolsa();
	
	public void escreverRelatorioParcial();
}
