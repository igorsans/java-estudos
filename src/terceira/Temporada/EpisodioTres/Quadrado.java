package terceira.Temporada.EpisodioTres;

public class Quadrado implements Forma{
    double largura;
    double area;

    public Quadrado(Double largura){
        this.largura = largura;
    }
    @Override
    public void calcularArea() {
        area = largura * largura;
        System.out.println("A area do quadrado é: " + area);
    }
}
