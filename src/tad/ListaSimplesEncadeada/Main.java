package tad.ListaSimplesEncadeada;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();

        lista.adicionar(1);

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adicionar(2);

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adicionar(3);

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.limpa();

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);
    }
}
