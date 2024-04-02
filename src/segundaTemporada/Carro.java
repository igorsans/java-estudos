package segundaTemporada;

import java.util.Calendar;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    int idadeCarro(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - ano;
    }
}
