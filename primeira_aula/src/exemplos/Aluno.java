
package exemplos;

public class Aluno extends Object
{
	// itens privados dependem da *CLASSE*
	private String nome;
	private String matricula;
	
	public Aluno(String novoNome, String novaMatricula)
	{
		this.nome = novoNome;
		this.matricula = novaMatricula;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getMatricula()
	{
		return this.matricula;
	}
	
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	/**
	 * O método equals testa se: 1) dois objetos possuem origem na mesma classe;
	 * 2) e possuem o mesmo conteúdo.
	 *
	 * Idéia da estratégia geral do equals:
	 *
	 * - Testa se o parâmetro não é null - Testa se o parâmetro é do mesmo tipo
	 * (instanceof) - Faz a conversão forçada de tipos (cast) - Verifica
	 * igualdade de todos os campos da classe - Se houver composição estrutural,
	 * vamos reusar o equals para ajudar aqui.
	 */
	@Override public boolean equals(Object outroObjeto)
	{
		// assume que é verdade e tenta provar o contrário
		boolean resultado = true;
		
		// operações para tentar ver se é falso;
		if (outroObjeto == null)
		{
			
			resultado = false;
		}
		
		// testa se o parâmetro é do mesmo tipo dessa classe
		if ((outroObjeto instanceof Aluno) == false)
		{
			
			resultado = false;
		} else
		{
			
			// não é null e é Aluno. Vamos testar conteúdo.
			// Preciso de uma variável do mesom tipo,
			// para enxergar os atributos.
			Aluno outroAluno = (Aluno) outroObjeto;
			
			// outroObjeto.
			// outroAluno.
			
			// if(this.nome.equals(outroAluno.nome))
			// if(nome.equals(outroAluno.nome) &&
			// matricula.equals(outroAluno.matricula))
			if ((this.nome != null) && this.nome.equals(outroAluno.nome))
			{
				
				if ((this.matricula != null) && this.matricula.equals(outroAluno.matricula))
				{
					
					// agora eu sei que o conteúdo é igual.
					resultado = true;
				} else
				{
					
					resultado = false;
				}
			} else
			{
				
				resultado = false;
			}
			
			// resultado = testaNome(outroAluno.nome) &&
			// testaMatricula(outroAluno.matricula);
		}
		
		// retorna o valor calculado.
		return resultado;
	}
}