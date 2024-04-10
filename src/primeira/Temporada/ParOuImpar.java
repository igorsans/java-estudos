package primeira.Temporada;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero e diremos se ele é par ou impar!");
        int num = leitura.nextInt();
        if (num % 2 == 0 )
            System.out.println("Seu numero é par!");
        else
            System.out.println("Seu numero é impar!");
    }
}
