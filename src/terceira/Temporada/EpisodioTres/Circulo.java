package terceira.Temporada.EpisodioTres;

public class Circulo implements Forma{
    private double area;
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * (raio * raio);
        System.out.println("A area do ciruculo é: " + area);
    }
}
