package terceira.Temporada.EpisodioTres;

import java.util.ArrayList;

public class Main {
    static double medio;
    static double maiorSaldo = 0;
    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList<>();
        Lista.add("Um");
        Lista.add("Dois");
        Lista.add("Três");
        Lista.forEach(System.out::println);

        Cachorro cachorro = new Cachorro();

        if (cachorro instanceof Cachorro){
            Animal animal = (Animal) cachorro;
            System.out.println(animal);
        } else {
            System.out.println("Esse objeto já é um animal");
        }

        Produto produto = new Produto("Carne", 10);
        Produto produto1 = new Produto("Feijão", 5);
        Produto produto2 = new Produto("Leite", 4);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        listaDeProdutos.forEach(item -> {
            medio += item.getPreco();
        });

        System.out.println( medio/listaDeProdutos.size() );

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        Quadrado quadrado = new Quadrado(2.0);
        Quadrado quadrado1 = new Quadrado(5.0);
        Circulo circulo = new Circulo(2.0);
        Circulo circulo1 = new Circulo(4.0);

        listaDeFormas.add(quadrado);
        listaDeFormas.add(quadrado1);
        listaDeFormas.add(circulo);
        listaDeFormas.add(circulo1);
        listaDeFormas.forEach(item -> item.calcularArea());

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        ContaBancaria conta = new ContaBancaria("1234", 25);
        ContaBancaria conta1 = new ContaBancaria("4321", 50);
        ContaBancaria conta2 = new ContaBancaria("1472", 70);

        listaDeContas.add(conta);
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);

        listaDeContas.forEach(item -> {
            if (item.getSaldo() > maiorSaldo){
                maiorSaldo = item.getSaldo();
            }
        });
        System.out.println(maiorSaldo);
    }
}
