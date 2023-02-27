package loja;

public class Endereco {
    private final String rua;
    String cep;
    String numero;

    public Endereco(String rua, String cep, String numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }
}
