package exemplos;

import java.util.ArrayList;

public class ExemplosArrayList
{
	ArrayList<String> conjunto = new ArrayList<>();
	
	public static void main(String[] args)
	{
		ExemplosArrayList testador = new ExemplosArrayList();
		testador.testaArray();
	}

	private void testaArray()
	{
		String texto = "abc";
		String segundoTexto = "def";
		
		conjunto.add(texto);
		conjunto.add(segundoTexto);
		
		testaSeExiste(texto);
		testaSeExiste("fgh");
		
		// mostra que funciona, mesmo com outra referência
		texto = new String("abc");
		testaSeExiste(texto);
		
		// se testar antes de adicionar deve dizer que não tem
		testaSeExiste(null);
		
		texto = null;
		conjunto.add(texto);

		conjunto.add(null);
		testaSeExiste(null);

		
	}

	private void testaSeExiste(String texto)
	{
		if(conjunto.contains(texto))
		{
			System.out.println("Contém o elemento: [" + texto + "]");
		}
		else
		{
			System.out.println("Não contém: [" + texto + "]");
		}
	}

}
