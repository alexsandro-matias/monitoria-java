package monitoria;

public class Vendedor extends Funcionario
{
	double comissao;
	
	public void receberSalario()
	{
		salario = salario + comissao;
	}
	
	public Vendedor(double salarioVendedor, double comissaoFuncionario)
	{
		salario = salarioVendedor;
		comissao = comissaoFuncionario;
	}
}
