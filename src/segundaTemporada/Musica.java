package segundaTemporada;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    void avaliar(int nota) {
        avaliacoes += nota;
        numAvaliacoes++;
    }
    double mediaAvaliacoes(){
        return avaliacoes / numAvaliacoes;
    }
}
