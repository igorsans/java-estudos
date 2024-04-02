package segunda.temporada.episodioTres;

public class testes {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setTitular("João");
        contaCorrente.depositar(50);
        contaCorrente.sacar(70);
        contaCorrente.sacar(20);
        System.out.println("Novo saldo: " + contaCorrente.getSaldo());
        contaCorrente.cobrarTarifaMensal();
    }


}
