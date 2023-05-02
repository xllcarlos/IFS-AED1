package tad;

import java.util.Scanner;

public class ListaSequencial {

    static Scanner input = new Scanner(System.in);

    /* @params
     *   option: opcao selecionada pelo usuario
     *   vetor: vetor a ser inserido os valores
     *   qtdVetor: quantidade de elementos que cabem no vetor
     *   contVetor: quantidade de elementos inseridos no vetor
     * */

    static String option;
    static int[] vetor;
    static int qtdVetor;
    static int contVetor;

    public static void main(String[] args) {

        ListaSequencial listaSequencial = new ListaSequencial();

        do {
            System.out.print("\u001B[32m" + """
                    ----------------------------\s
                    | 1 - Inicializar lista    |\s
                    | 2 - Imprimir lista       |\s
                    | 3 - Adicionar no inicio  |\s
                    | 4 - Adicionar no fim     |\s
                    | 5 - Buscar na lista      |\s
                    | 6 - Excluir elementos    |\s
                    ----------------------------\s
                    """ + "\u001B[0m");

            if (qtdVetor > 0) {
                System.out.println("| lista iniciada: " + contVetor + " de " + qtdVetor + " elementos inseridos");
                System.out.println("---------------------------");
            }

            System.out.print("Insira a opcao desejada, (exit para sair): ");
            option = input.next();

            switch (option) {
                case "1": {
                    // Inicializar lista
                    vetor = listaSequencial.inicializarLista(vetor);
                    break;
                }
                case "2": {
                    // Imprimir lista
                    listaSequencial.imprimirLista(vetor);
                    break;
                }
                case "3": {
                    // Adicionar no inicio
                    vetor = listaSequencial.inserirInicio(vetor);
                    break;
                }
                case "4": {
                    // Inserir no fim
                    vetor = listaSequencial.inserirFim(vetor);
                    break;
                }
                case "5": {
                    // Buscar na lista
                    listaSequencial.buscarElementos(vetor);
                    break;
                }
                case "6": {
                    // Excluir elementos
                    vetor = listaSequencial.excluirElementos(vetor);
                    break;
                }
                default: {
                    break;
                }
            }

        } while (!option.equals("exit"));

    }

    public int[] inicializarLista (int[] vetor) {

        System.out.println("Inicializar lista\nDeseja iniciar a lista com quantos elementos?");

        contVetor = 0; // Reiniciando contagem
        qtdVetor = input.nextInt();
        vetor = new int[qtdVetor];

        for (int i = 0; i < qtdVetor; i++) {
            System.out.println("Insira o " + (i + 1) + " de " + qtdVetor + " elemento do vetor, (exit para sair)");
            String elemento = input.next();

            if (elemento.equals("exit")) {
                break;
            }
            else {
                vetor[i] = Integer.parseInt(elemento);
                contVetor++;
            }

        }

        return vetor;
    }

    public void imprimirLista(int[] vetor) {

        if (qtdVetor > 0) {
            for (int i = 0; i < contVetor; i++) {
                System.out.print("| "+ vetor[i] +" |");
            }
            System.out.println();
        }
        else {
            System.out.println("A lista ainda nao foi inicializada!");
        }
    }

    public int[] inserirInicio(int[] vetor) {

        System.out.println("Insira o elemento para ser adicionado no inicio, caso a lista esteja cheia, o valor sera substituido! (exit para sair)");
        String elemento = input.next();

        if (elemento.equals("exit")) {
            System.out.println("Acao de inserir no inicio foi cancelada");
        }
        else if (contVetor == qtdVetor) {
            vetor[0] = Integer.parseInt(elemento);
        }
        else {
            vetor[contVetor - 1] = vetor[0];
            vetor[0] = Integer.parseInt(elemento);
            contVetor++;
        }

        return vetor;
    }

    public int[] inserirFim(int[] vetor) {

        System.out.println("Insira o elemento para ser adicionado no fim, caso a lista esteja cheia, o valor sera substituido! (exit para sair)");
        String elemento = input.next();

        if (elemento.equals("exit")) {
            System.out.println("Acao de inserir no inicio foi cancelada");
        }
        else if (contVetor == qtdVetor) {
            vetor[contVetor - 1] = Integer.parseInt(elemento);
        }
        else {
            vetor[contVetor - 1] = Integer.parseInt(elemento);
            contVetor++;
        }

        return vetor;
    }

    public void buscarElementos(int[] vetor) {

        int qtdElementos = 0;
        int[] elementosEncontrados = new int[qtdVetor];

        System.out.print("Qual elemento voce deseja buscar na lista, (exit para sair)? ");
        String elemento = input.next();

        if (elemento.equals("exit")){
            System.out.println("Acao de buscar na lista foi cancelada");
        }
        else {

            // Buscando elementos
            for (int i = 0; i < contVetor; i++) {
                if (vetor[i] == Integer.parseInt(elemento)) {
                    elementosEncontrados[qtdElementos] = i;
                    qtdElementos++;
                }
            }

            // Imprimindo elementos encontrados
            if (qtdElementos > 0) {
                System.out.println("O elemento foi encontrado na(s) posicao(oes)");

                for (int i = 0; i < qtdElementos; i++) {
                    System.out.print("| "+ elementosEncontrados[i] +" |");
                }

                System.out.println();
            }
            else {
                System.out.println("O elemento nao foi encontrado na lista");
            }
        }
    }

    public int[] excluirElementos(int[] vetor) {

        int elementosEncontrados = 0;
        int contVetorTemp = 0;
        int[] vetorTemp = new int[qtdVetor];

        System.out.print("Insira o elemento que deseja excluir! (exit para sair): ");
        String elemento = input.next();

        if (elemento.equals("exit")) {
            System.out.println("Acao de buscar na lista foi cancelada");
        }
        else{
            for (int i = 0; i < contVetor; i++) {
                //Percorrendo o vetor

                if (vetor[i] != Integer.parseInt(elemento)) {
                    //
                    vetorTemp[contVetorTemp] = vetor[i];
                    contVetorTemp++;
                }
                else {
                    elementosEncontrados++;
                }
            }
        }

        contVetor = contVetor - elementosEncontrados;

        return vetorTemp;
    }
}
