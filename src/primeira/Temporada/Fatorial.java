package primeira.Temporada;

import java.util.Scanner;

public class Fatorial {
    public static int factorialize(int num) {
        if (num < 0 )
            return 1;
        else if (num == 0)
            return 1;
        else {
            return num * factorialize(num -1);
        }

    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero e calcularemos o seu fatorial!");
        int num = leitura.nextInt();
        System.out.println("O numero que você digitou é: " + num + " e o seu fatorial é: " + factorialize(num));
    }
}
