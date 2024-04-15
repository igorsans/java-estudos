package terceira.Temporada.episodioUm;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        var pessoa2 = new Pessoa();
        var pessoa3 = new Pessoa();
        pessoa.setNome("João");
        pessoa2.setNome("Maria");
        pessoa3.setNome("Kaio");
        pessoa.setIdade(20);
        pessoa2.setIdade(25);
        pessoa3.setIdade(30);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size() + " é o tamanho da lista");
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);


    }
}
