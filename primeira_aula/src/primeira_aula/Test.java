package primeira_aula;

public class Test {
	public static void main(String[] args) {

//		Utilizando um construtor com dois parâmetros
		Funcionario sandro = new Funcionario(1000, "Alexsandro");

//		Utilizando um construtor com apenas um parâmetro
		Funcionario segundo = new Funcionario("matias");

//		Utilizando um construtor com apenas um parâmetro
		Funcionario alexsandro = new Funcionario("alex");

//		Outra forma de atribuir os valores de atributos (hard code)
		alexsandro.escolaridade = "ensino superior completo";

//		imprimindo o valor de referência da variavel
		System.out.println(alexsandro);
		System.out.println(sandro);

//		imprimindo o valor dos atributos de um objeto.
		System.out.println(sandro.nome);
		System.out.println(sandro.salario);
		System.out.println(alexsandro.escolaridade);

	}

}
