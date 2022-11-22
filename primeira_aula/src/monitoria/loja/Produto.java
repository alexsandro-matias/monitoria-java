package monitoria.loja;

public class Produto {
	String nome;
	double preco;

	public void DescontoNoProduto(double desconto) {
		if (desconto > 0) {

			this.preco = this.preco - this.preco * (desconto / 100);
		}

		else {
			System.out.println("Valor de desconto inválido.");
			System.out.println("Valor do produto não foi alterado.");
		}

	}

}
