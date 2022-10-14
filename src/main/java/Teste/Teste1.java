package Teste;

import java.sql.Array;
import java.util.ArrayList;

public class Teste1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Banana");
        lista.add("Maçã");
        lista.add("Batata");
        lista.add(1,"Rotação de centro");
        System.out.println(lista);
        lista.add("Carro de corrida");
        lista.add("Batata");
        System.out.println("A posição de 'Batata' na lista é +"+lista.indexOf("Batata"));
        System.out.println("A posição de 'Batata' na lista é +"+lista.lastIndexOf("Batata")); // feito
        System.out.println("O elemento 'Carro de corrida' existe na lista? "+lista.contains("Carro de corrida"));
        System.out.println("O elemento 'Carros' existe na lista? "+lista.contains("Carros"));
        System.out.println("O tamanho atual da lista é "+lista.size());
        System.out.println(lista);
        lista.remove("Batata");
        System.out.println(lista);
        lista.clear();
    }
}
