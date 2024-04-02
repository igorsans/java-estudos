package segunda.temporada.episodioTres;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal(){
        saldo -= 50;
        System.out.println("Uma tarifa de R%: 50 foi cobrada, o seu saldo agora é de :" + saldo);
    }
}
