package escola;

public interface Atleta
{
	public void treinar();
	// a sintaxe do método abstrato seria essa aqui.
	// public void competir();
	
	// exemplo de um método default.
	public default void competir()
	{
		System.out.println("Atleta competiu.");
	}
}