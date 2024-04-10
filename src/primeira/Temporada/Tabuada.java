package primeira.Temporada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero que traremos sua tabuada de 1 a 10!");
        int num = leitura.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i+1) + " = " + num*(i+1));
        }
    }
}
