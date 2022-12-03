package monitoria.escola;

import java.util.ArrayList;

public class Aluno implements BolsistaAtleta
{
	private String nome;
	private String matricula;
	private ArrayList<Aluno> listaDeAluno;
	
	@Override public void setValorFinalDaBolsa(double novoValor)
	{
	}
	
	@Override public void escreverRelatorioParcial()
	{
		System.out.println("Aluno escrevendo relatório");
	}
	
	@Override public void treinar()
	{
	}
	
	@Override public void competir()
	{
		System.out.println("Aluno competindo");
	}
}
