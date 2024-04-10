package segunda.temporada.episodioQuatro;

public class Livro implements Calculavel{
    double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco -= preco * 0.1;
    }
}
