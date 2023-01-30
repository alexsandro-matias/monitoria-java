
package escola;

/**
 * Representa um colaborador que faz parte de algum programa de bolsa.
 *
 * @author ALUNO
 */
public interface Bolsista
{
	/**
	 * Paga a bolsa ao bolsista.
	 */
	public double receberBolsa();

	/**
	 * Faz o bolsista relatar o que foi feito.
	 */
	public void escreverRelatorioParcial();

	double valorFinalDaBolsa();
}
