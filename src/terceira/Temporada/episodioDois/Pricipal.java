package terceira.Temporada.episodioDois;

import java.util.ArrayList;

public class Pricipal {
    public static void main(String[] args) {
        Produto produto = new Produto("Leite", 20.0, 2);
        Produto produto1 = new Produto("Susu", 20.0, 4);
        Produto produto2 = new Produto("Chokopik", 7.0, 6);

        ArrayList<Produto> arrayDeProdutos = new ArrayList<>();
        arrayDeProdutos.add(produto);
        arrayDeProdutos.add(produto1);
        arrayDeProdutos.add(produto2);

        System.out.println(arrayDeProdutos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite" , 20, 10, 022024);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Susu" , 15, 10, 072024);
        ProdutoPerecivel produtoPerecivel2 = new ProdutoPerecivel("Chokopik" , 40, 10, 012024);

        ArrayList<ProdutoPerecivel> arrayDeProdutosPereciveis = new ArrayList<>();
        arrayDeProdutos.add(produtoPerecivel);
        arrayDeProdutos.add(produtoPerecivel1);
        arrayDeProdutos.add(produtoPerecivel2);

        System.out.println(arrayDeProdutos);



    }
}
