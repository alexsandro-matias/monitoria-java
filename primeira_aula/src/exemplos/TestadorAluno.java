package exemplos;

public class TestadorAluno
{
	public static void main(String[] args)
	{
		TestadorAluno testador = new TestadorAluno();
		
		testador.testarEquals();

	}

	private void testarEquals()
	{
		Aluno primeiroAluno, segundoAluno, terceiroAluno;
		
		primeiroAluno = new Aluno("João", "20222y6-rc1234");
		segundoAluno  = new Aluno("João", "20222y6-rc1234");
		
		terceiroAluno = new Aluno("José", "20222y6-rc1234");
		
//		terceiroAluno = new Aluno(null, "20222y6-rc1234");
		
		primeiroAluno = new Aluno(null, null);
		
		Aluno aluno = new Aluno("Alexsandro", "15644564561465");
		
		comparaAlunos(primeiroAluno, primeiroAluno);
//		comparaAlunos(primeiroAluno, segundoAluno);
//		comparaAlunos(terceiroAluno, segundoAluno);
//		comparaAlunos(primeiroAluno, terceiroAluno);
//		
//		String meuTexto = "bom dia!"; 
//		comparaAlunos(primeiroAluno, meuTexto);
		
//		comparaAlunos(primeiroAluno, null);
		comparaAlunos(null, primeiroAluno);
	}

	//private void comparaAlunos(Aluno primeiroAluno, Aluno segundoAluno)
	private void comparaAlunos(Object primeiroAluno, Object segundoAluno)
	{
		if(primeiroAluno.equals(segundoAluno))
		{
			System.out.println("Alunos têm mesmo conteúdo.");
		}
		else
		{
			System.out.println("Alunos têm conteúdo diferente.");
		}
	}
	
	private boolean testeArrayList(Object elemento)
	{
		// Returns true if this list contains the specified 
		// element. More formally, returns true if and only if 
		// this list contains at least one element e
		//  such that 
		// (o==null ? e==null : o.equals(e)).
		if(elemento == null)
		{
			// percorre a lista procurando um elemento null
			// usando o operador 	'
		}
		else
		{
			// percorre a lista procurando um elemento 
			// que o método equals retorna true
		}
		return false;
	}

}
