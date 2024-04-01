import java.util.Scanner;

public class QuadradoOuCirculo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Você deseja calcular a area do quadrado ou do cirulo?");
        String resposta = leitura.nextLine();
        if (resposta.equals("quadrado")){
            System.out.println("Qual a Altura ou Largura do quadrado?");
            int areaQuadrado = leitura.nextInt();
            System.out.println("A área do seu quadrado é: " + Math.pow(areaQuadrado,2));
        } else {
            System.out.println("Qual a largura do seu raio?");
            int raio = leitura.nextInt();
            System.out.println("A área do seu circulo é: " + Math.PI * (Math.pow(raio, 2)) );
        }
    }
}
