package Teste;

import EstruturaBasica.EstruturaBasica;

public class Teste {
    public static void main(String[] args) {
        EstruturaBasica<String> e1 = new EstruturaBasica(10);
        e1.adiciona("Repolho");
        e1.adiciona("Beterraba");
        e1.adiciona("Maçã");
        e1.adiciona("Banana");
        e1.adiciona("Cebola");
        e1.adiciona("Batata Frita");
        e1.adiciona("Batata");
        e1.adiciona("Rabanete");
        e1.adiciona("Pêra");
        e1.adiciona("Ratatata");
        e1.adiciona("Batata");
        e1.adiciona("Rabanete");
        e1.adiciona("Pêra");
        e1.adiciona("Ratatata");
        e1.adiciona("Rabanete");
        e1.adiciona("Pêra");
        e1.adiciona("Ratatata");
        System.out.println(e1.tamanhoLista());
        System.out.println(e1.ultimoDe("Pêra"));
        System.out.println(e1.possui("Ratatata"));
        System.out.println(e1);
        e1.apagarLista();
        System.out.println(e1);
    }
}