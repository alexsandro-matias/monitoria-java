package colecoes;

import java.util.ArrayList;

public class Modelo
{
	private ArrayList<Aluno> listaAlunos;
	// private ArrayList<Aluno> listaBolsistas;
	private ArrayList<Bolsista> listaBolsistas;

	public Modelo()
	{
		// sintaxe antiga: NÃO USEM!!!
		// listaAlunos = new ArrayList();
		this.listaAlunos = new ArrayList<>();
		this.listaBolsistas = new ArrayList<>();
	}

	public void adicionaAluno(Aluno novoAluno)
	{
		this.listaAlunos.add(novoAluno);
	}

	public void gerarRelatorio(Bolsista alguem)
	{
		alguem.escreverRelatorioParcial();
	}

	public void gerarRelatorios()
	{
		// for (Aluno aluno : listaAlunos)
		for (Bolsista algumBolsista : this.listaBolsistas)
		{
			algumBolsista.receberBolsa();
			algumBolsista.escreverRelatorioParcial();
		}
	}
}
