package segunda.temporada.episodioQuatro;


public class TabuadaMultiplicacao implements Tabuada {
    private int numero;



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        int num = getNumero();
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i+1) + " = " + num*(i+1));
        }
    }
}
