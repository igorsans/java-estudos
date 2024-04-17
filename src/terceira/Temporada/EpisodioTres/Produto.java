package terceira.Temporada.EpisodioTres;

public class Produto {
    private double preco;

    public double getPreco() {
        return preco;
    }

    private String nome;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
