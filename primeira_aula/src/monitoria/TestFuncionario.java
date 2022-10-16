package monitoria;

public class TestFuncionario
{
	public static void main(String[] args)
	{
		Funcionario abadie = new Funcionario();
		abadie.local = new Endereco();
		abadie.local.rua = "teste";
		String casaDeAbadie = abadie.local.rua;
		System.out.println(casaDeAbadie);
	}
}
