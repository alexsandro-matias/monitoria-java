package monitoria;

public class TestRoda {
	public static void main(String[] args) {
		
		Carro opala = new Carro();
		
		opala.roda = new Roda();
		
		int tamanhoAro = opala.roda.aro = 15;
		
		System.out.println(tamanhoAro);
		
		

	}

}
