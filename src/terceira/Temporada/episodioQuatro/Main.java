package terceira.Temporada.episodioQuatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(5);

        Collections.sort(list);
        System.out.println(list);

        List<Titulo> listaDeTitulos = new ArrayList<>();
        Titulo titulo = new Titulo("A casa de cera");
        Titulo titulo1 = new Titulo("A Bruxa");
        Titulo titulo2 = new Titulo("O Astronauta");
        Titulo titulo3 = new Titulo("Familia da Pesada");

        listaDeTitulos.add(titulo);
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);

        List<String> listaTeste = new LinkedList<>();
        listaTeste.add("Primeiro");
        listaTeste.add("Segundo");
        listaTeste.add("Terceiro");

        List listaTeste1 = (List) listaTeste;

        System.out.println(listaTeste1);
    }
}
