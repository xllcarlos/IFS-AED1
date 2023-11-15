package materiais.tad.FilaSequencial;

import materiais.tad.FilaException.FilaCheia;

public class Main {

    public static void main(String[] args) {

        FilaSequencial filaSequencial = new FilaSequencial(18);

        System.out.println(filaSequencial.filaCheia());
        System.out.println(filaSequencial.filaVazia());

        try {
            filaSequencial.adicionar(2);
            filaSequencial.adicionar(5);
            filaSequencial.adicionar(8);
        } catch (FilaCheia e) {
            System.out.println(e);
        }

        System.out.println(filaSequencial.remover());
        System.out.println(filaSequencial.remover());
        System.out.println(filaSequencial.remover());
    }
}
