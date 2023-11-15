package materiais.tad.ListaSequencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        int option;

        do {

            System.out.println("\u001B[32m" + """
                    ----------------------------\s
                    | 1 - Inicializar lista    |\s
                    | 2 - Imprimir lista       |\s
                    | 3 - Adicionar no inicio  |\s
                    | 4 - Adicionar no fim     |\s
                    | 5 - Buscar na lista      |\s
                    | 6 - Excluir elementos    |\s
                    ----------------------------\s
                    """ + "\u001B[0m");

            System.out.print("Insira a opcao: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> lista.iniciarLista();
                case 2 -> lista.imprimirLista();
                case 3 -> lista.adicionarInicio();
                case 4 -> lista.adicionarFinal();
                case 5 -> lista.buscarElementos();
                case 6 -> lista.excluirElementos();
            }
        } while (option != -1);
    }
}
