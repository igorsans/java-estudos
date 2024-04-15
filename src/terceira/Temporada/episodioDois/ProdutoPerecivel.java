package terceira.Temporada.episodioDois;

public class ProdutoPerecivel extends Produto {
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome='" + this.getNome() + '\'' +
                ", preco=" + this.getPreco() +
                ", quantidade=" + this.getQuantidade() +
                " dataValidade=" + dataValidade +
                '}';
    }
}
