package primeira.Temporada;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int meta = new Random().nextInt(100);
        System.out.println("Boas vindas ao jogo primeira.Temporada.Guess! tente advinhar o numero entre 0 e 100!");
        int numeroDeTentativas = 0;
        int resposta = leitura.nextInt();

        while(resposta != meta) {
            if(resposta > meta) {
                System.out.println("O numero que você digitou é maior! Tente novamente.");
                numeroDeTentativas++;
            } else {
                System.out.println("O numero que você digitou é menor! Tente novamente.");
                numeroDeTentativas++;
            }
            resposta = leitura.nextInt();
        }

        System.out.println("Em: " + numeroDeTentativas + " Tentativas você acertou o numero é: " + meta );
    }
}
