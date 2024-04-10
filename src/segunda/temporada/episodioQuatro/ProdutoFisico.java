package segunda.temporada.episodioQuatro;

public class ProdutoFisico implements Calculavel{
    double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco += preco * 0.1;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
