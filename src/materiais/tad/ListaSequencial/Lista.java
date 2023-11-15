package materiais.tad.ListaSequencial;

import java.util.Scanner;

public class Lista {
    public static Scanner scanner = new Scanner(System.in);

    public int qtd = 0;
    public int[] vetor;

    public int getQtd() {
        return this.qtd;
    }

    public void iniciarLista() {

        System.out.print("Insira a quantidade de elementos do vetor: ");
        qtd = scanner.nextInt();
        vetor = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Insira o elemento " + (i + 1) + " de " + (qtd) + " do vetor!");
            vetor[i] = scanner.nextInt();
        }

    }

    public void imprimirLista() {

        if (qtd != 0) {
            for (int i = 0; i < qtd; i++) {
                System.out.print("| " + vetor[i] + " |");
            }

            System.out.println(); // quebra de linha
        }
        else {
            System.out.println("Lista não inicializada!");
        }
    }

    public void adicionarInicio() {

        if (qtd != 0) {
            System.out.println("Insira o elemento a ser adicioando no inicio");
            int[] newVetor = new int[qtd + 1];
            newVetor[0] = scanner.nextInt();

            for (int i = 0; i < qtd; i++) {
                newVetor[i + 1] = vetor[i];
            }

            qtd++;
            vetor = newVetor;
        }
        else {
            System.out.println("Lista não inicializada!");
        }
    }

    public void adicionarFinal() {

        if (qtd != 0) {
            System.out.println("Insira o elemento a ser adicioando no final");
            int elemento = scanner.nextInt();

            int[] newVetor = new int[qtd + 1];

            for (int i = 0; i < qtd; i++) {
                newVetor[i] = vetor[i];
            }

            newVetor[qtd] = elemento;

            qtd++;
            vetor = newVetor;
        }
        else {
            System.out.println("Lista não inicializada!");
        }
    }

    public void buscarElementos() {

        if (qtd != 0) {

            System.out.println("Insira o elemento a ser buscado na lista");
            int elemento = scanner.nextInt();

            for (int i = 0; i < qtd; i++) {
                if (vetor[i] == elemento) {
                    System.out.print("| " + i + " |");
                }
            }
            System.out.println(); //quebra de linha
        }
        else {
            System.out.println("Lista não inicializada!");
        }
    }

    public void excluirElementos() {

        if (qtd != 0) {

            int newQtd = 0;
            int[] newVetor = vetor;

            System.out.println("Insira o elemento a ser excluido da lista");
            int elemento = scanner.nextInt();

            for (int i = 0; i < qtd; i++) {
                if (elemento != vetor[i]) {
                    newVetor[newQtd] = vetor[i];
                    newQtd++;
                }
            }

            vetor = newVetor;
            qtd = newQtd;
        }
        else {
            System.out.println("Lista não inicializada!");
        }
    }
}
