import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero negativo ou positivo!");
        int resposta = leitura.nextInt();

        if (resposta >= 0)
            System.out.println("O numero que você digitou é positivo!");
        else
            System.out.println("O numero que você digitou é negativo!");
    }
}
