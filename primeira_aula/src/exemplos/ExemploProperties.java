package exemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExemploProperties
{
	// instanciar um properties
	Properties propriedades = new Properties();

	public static void main(String[] args) throws IOException
	{
		ExemploProperties exemplo = new ExemploProperties();
		
//		exemplo.imprimePropriedades();
		
		// adicionar propriedades
//		exemplo.preenchePropriedades();
//		exemplo.imprimePropriedades();
//		
//		exemplo.consultarChaves();
//		
////		// gravar o arquivo em disco
//		exemplo.gravarPropriedades();
//		
//		// observar o conteúdo no disco
//		// fazer a leitura do arquivo
//		exemplo.carregarPropriedades();
		exemplo.carregarPropriedadesDoSistema();
		exemplo.imprimePropriedades();
//		
//		// modificar no disco e ler para o programa

	}

	private void preenchePropriedades()
	{
		//eclipse.preferences.version=1
		propriedades.setProperty("Versão", "1");
		propriedades.setProperty("debug", "true");
		propriedades.setProperty("log", "verbose");
	}
	
	private void consultarChaves()
	{
		String chave = "Versão";
		String valor = propriedades.getProperty(chave);
		
		System.out.print("Chave: [" + chave + "]");
		System.out.println(" Valor -> [" + valor + "]");
	}
	

	private void gravarPropriedades() throws IOException
	{
		FileOutputStream saida = new FileOutputStream("minhas_propriedades.txt");
		
		propriedades.store(saida, "Comentário do properties aqui!!");
		
		System.out.println("Terminei a gravação.");
		System.out.println();
		
		saida.close();
	}

	private void carregarPropriedades() throws IOException
	{
		FileInputStream entrada = new FileInputStream("minhas_propriedades.txt"); 
		propriedades.load(entrada);
		
		System.out.println("Terminei a leitura.");
		System.out.println();
		
		entrada.close();
	}

	private void carregarPropriedadesDoSistema() throws IOException
	{
		propriedades = System.getProperties();
		
		System.out.println("Terminei a leitura de propriedades do sistema.");
		System.out.println();
	}
	private void imprimePropriedades()
	{
		String texto = propriedades.toString();
		System.out.println(texto);
		System.out.println();
	}

}
