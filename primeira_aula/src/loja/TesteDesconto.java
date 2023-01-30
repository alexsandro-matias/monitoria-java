package loja;

import java.util.Scanner;

public class TesteDesconto
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe o nome do produto: ");
		produto.nome = leitor.nextLine();
		System.out.println("Informe o preço do produto: ");
		produto.preco = leitor.nextDouble();
		System.out.println("Informe o desconto do produto: ");
		double desconto = leitor.nextDouble();
		produto.DescontoNoProduto(desconto);
		System.out.println(produto.preco);
	}
}
