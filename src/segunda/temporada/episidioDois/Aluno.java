package segunda.temporada.episidioDois;

public class Aluno {
    private String nome;
    private double notas;
    private int numeroDeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void adcionarNotas(double notas) {
        this.notas += notas;
        numeroDeNotas++;
    }

    public void calcularMedia(){
        System.out.println(notas / numeroDeNotas);
    }
}
