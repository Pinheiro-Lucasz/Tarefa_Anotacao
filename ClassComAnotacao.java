package ExemplosMod18.Anotacao;

@PrimeiraAnotacao(value = "Lucas", bairros = "Jardim Palmeiras", numeroCasa = 1223)
public class ClassComAnotacao {

    @PrimeiraAnotacao(value = "Pinheiro", bairros = {"Jardim Palmeiras", "Rua Violetas"}, numeroCasa = 1209, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Lucas", bairros = "Jardim Palmeiras", numeroCasa = 1223)
    public ClassComAnotacao() {

    }
}
