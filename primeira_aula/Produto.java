public class Produto {
    String nome;
    double preco;
    double desconto;

    public double Desconto()
    {
        double desc = preco - preco * (desconto / 100);
        return desc;
    }



}
