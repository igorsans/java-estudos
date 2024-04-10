package segunda.temporada.episodioQuatro;

public interface Vendavel {
    default double valorTotal(double preco, int quantidade){
        return preco * quantidade;
    };
    double aplicaDescontos();
}
