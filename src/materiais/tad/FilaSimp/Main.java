package materiais.tad.FilaSimp;

import materiais.tad.FilaException.ListaVazia;

public class Main {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.getTamanho());

        fila.enfileirar(10);

        System.out.println(fila.getTamanho());

        fila.enfileirar(20);

        System.out.println(fila.getTamanho());

        fila.enfileirar(40);

        System.out.println(fila.getTamanho());

        try {
            System.out.println(fila.remover());
            System.out.println(fila.remover());
            System.out.println(fila.remover());
            System.out.println(fila.remover());
        } catch (ListaVazia e) {
            System.out.println(e);
        }

    }
}
