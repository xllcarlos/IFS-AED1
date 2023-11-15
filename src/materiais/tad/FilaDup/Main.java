package materiais.tad.FilaDup;

public class Main {

    public static void main(String[] args) {

        FilaDup<FilaDup<Integer>> filaDup = new FilaDup<>();

        FilaDup<Integer> filaDup1 = new FilaDup<>();

        filaDup.enfileirar(filaDup1);
        filaDup.enfileirar(filaDup1);
        filaDup.enfileirar(filaDup1);

        System.out.println(filaDup.remover());
        System.out.println(filaDup.remover());
        System.out.println(filaDup.remover());

        System.out.println(filaDup.remover());
    }
}
