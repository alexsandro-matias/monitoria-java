package monitoria;

public class TestFuncionario
{
	public static void main(String[] args)
	{
		// Funcionario sandro = new Funcionario();
		// sandro.receberSalario();
		// System.out.println(sandro.salario);
		// Funcionario carla = new Funcionario();
		// carla.receberSalario(6000, "carla");
		// System.out.println(carla.salario);
		// System.out.println(carla.nome);
		// Vendedor joao = new Vendedor(1000, 300);
		// joao.receberSalario();
		// System.out.println(joao.salario);
		Funcionario abadie = new Professor("Paulo Guedes", "1221387");
		abadie.setSalario(1500);
		System.out.println(abadie.getNome());
		System.out.println(abadie.getSalario());
		
	}
}
