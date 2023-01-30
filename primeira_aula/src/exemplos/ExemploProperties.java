
package exemplos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExemploProperties
{
	// instanciar um properties
	Properties propriedades = new Properties();

	public static void main(String[] args) throws IOException
	{
		ExemploProperties exemplo = new ExemploProperties();

		// exemplo.imprimePropriedades();

		// adicionar propriedades
		// exemplo.preenchePropriedades();
		// exemplo.imprimePropriedades();
		//
		// exemplo.consultarChaves();
		//
		//// // gravar o arquivo em disco
		// exemplo.gravarPropriedades();
		// exemplo.gravarPropriedadesComWriter();
		//
		// // observar o conteúdo no disco
		// // fazer a leitura do arquivo
		exemplo.carregarPropriedadesDoSistema();
		exemplo.carregarPropriedades();
		exemplo.imprimePropriedades();
		//
		// // modificar no disco e ler para o programa

	}

	private void carregarPropriedades() throws IOException
	{
		// propriedades.clear();
		FileInputStream entrada = new FileInputStream("minhas_propriedades.txt");
		this.propriedades.load(entrada);

		System.out.println("Terminei a leitura.");
		System.out.println();

		entrada.close();
	}

	private void carregarPropriedadesDoSistema() throws IOException
	{
		this.propriedades = System.getProperties();

		System.out.println("Terminei a leitura de propriedades do sistema.");
		System.out.println();
	}

	private void imprimePropriedades()
	{
		// String texto = propriedades.toString();
		// System.out.println(texto);
		// System.out.println();
		this.propriedades.list(System.out);

	}

}
