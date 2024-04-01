import java.util.Scanner;

public class DoisInteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite dois numeros!");
        int valor1 = leitura.nextInt();
        int valor2 = leitura.nextInt();
        if(valor1 == valor2) {
            System.out.println("Os dois numeros são iguais");
        } else if (valor1 > valor2) {
            System.out.println("O primeiro numero é maior");
        } else {
            System.out.println("O segundo numero é maior");

        }
    }
}
