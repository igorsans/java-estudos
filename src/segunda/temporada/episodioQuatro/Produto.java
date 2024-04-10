package segunda.temporada.episodioQuatro;

public class Produto implements Vendavel {
    private int quantidade;
    private double preco;
    private boolean descontado = false;

    public boolean isDescontado() {
        return descontado;
    }

    public void setDescontado(boolean descontado) {
        this.descontado = descontado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double aplicaDescontos() {
        double valor = this.valorTotal(this.preco, this.quantidade);
        if (isDescontado()){
            System.out.print("Esse produto já recebeu desconto, o valor é: ");
            return getPreco();
        } else if (quantidade > 5) {
            setDescontado(true);
            setPreco(valor -= valor * 0.2);
            return getPreco();
        } else {
            setDescontado(true);
            return valor;
        }
    }
}
