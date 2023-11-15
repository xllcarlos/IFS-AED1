package materiais.tad.PilhaSequencial;

public class Main {
    public static void main(String[] args) {

        PilhaSequencial<Integer> pilhaSequencial = new PilhaSequencial<>(5);

        pilhaSequencial.enfileirar(5);
        pilhaSequencial.enfileirar(6);
        pilhaSequencial.enfileirar(8);
        pilhaSequencial.enfileirar(7);

        System.out.println(pilhaSequencial.remover());
        System.out.println(pilhaSequencial.remover());
        System.out.println(pilhaSequencial.remover());
        System.out.println(pilhaSequencial.remover());
    }
}
