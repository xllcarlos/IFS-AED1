package tad.PilhaEncadeada;

public class Main {

    public static void main(String[] args) {

        PilhaEncadeada<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        pilhaEncadeada.enfileirar(1);
        pilhaEncadeada.enfileirar(2);
        pilhaEncadeada.enfileirar(4);
        pilhaEncadeada.enfileirar(3);

        System.out.println(pilhaEncadeada.remover());
        System.out.println(pilhaEncadeada.remover());
        System.out.println(pilhaEncadeada.remover());
        System.out.println(pilhaEncadeada.remover());
    }
}
