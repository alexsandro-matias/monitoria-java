package autos;

public class TestRoda
{
	public static void main(String[] args)
	{
		Carro opala = new Carro();
		
		opala.roda = new Roda();
		
		
		opala.modelo = "Opala";
		
		
		opala.roda.aro = 15;
		opala.roda.modelo = "Relâmpago";
		
		System.out.println(opala.modelo);
		System.out.println(opala.roda.aro);
		System.out.println(opala.roda.modelo);
	}
}
