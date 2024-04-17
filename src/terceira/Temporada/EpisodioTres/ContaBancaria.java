package terceira.Temporada.EpisodioTres;

public class ContaBancaria {
    private String numeroConta;
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public ContaBancaria(String numeroConta, int saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
