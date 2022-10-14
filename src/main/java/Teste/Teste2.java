package Teste;

import EstruturaBasica.EstruturaBasica;

public class Teste2 {
    public static void main(String[] args) {
        EstruturaBasica<String> e1 = new EstruturaBasica(1);
        e1.adiciona("Barata");
        e1.adiciona("Mosquito");
        e1.adiciona("Rato");
        e1.adiciona(2, "Aranha");
        System.out.println(e1);
        e1.remove(2);
        System.out.println(e1);
    }
}
