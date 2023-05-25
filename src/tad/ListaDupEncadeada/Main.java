package tad.ListaDupEncadeada;

import provaI.ListaEnc;

public class Main {
    public static void main(String[] args) {

        ListaDup<Integer> lista = new ListaDup<Integer>();

        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionarPosicao(2, 55);
        lista.adicionar(5);
        System.out.println(lista);

        ListaDup<Integer> sub;
        sub = lista.subLista(2,3);
        System.out.println(sub);
    }
}
