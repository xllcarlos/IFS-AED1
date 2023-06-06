package tad.FilaDup;

public class Main {

    public static void main(String[] args) {

        FilaDup<Integer> filaDup = new FilaDup<>();

        filaDup.enfileirar(10);
        filaDup.enfileirar(20);
        filaDup.enfileirar(30);

        System.out.println(filaDup.remover());
        System.out.println(filaDup.remover());
        System.out.println(filaDup.remover());

        filaDup.enfileirar(40);
        System.out.println(filaDup.remover());
    }
}
