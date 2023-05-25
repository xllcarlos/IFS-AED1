package provaI;

public class Main {

    public static void main(String[] args) {

        ListaEnc<Integer> lista = new ListaEnc<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.incluirPosicao(3, 1);
        System.out.println(lista);
    }
}
