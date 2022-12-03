package monitoria.escola;

public interface BolsistaAtleta extends Atleta, Bolsista
{
	double bolsa = 1000;
	
@Override public default double receberBolsa()
{
	return 2000;
}
}
