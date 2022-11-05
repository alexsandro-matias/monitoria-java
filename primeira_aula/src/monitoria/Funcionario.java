package monitoria;

public class Funcionario
{
	protected String matricula;
	protected String nome;
	protected double salario;
	private Endereco endereco;
	
	public void receberSalario()
	{
		salario = 1000;
	}
	
	public void receberSalario(double salarioFuncionario, String nomeFuncionario)
	{
		salario = salarioFuncionario;
		nome = nomeFuncionario;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
}