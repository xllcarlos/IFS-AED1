package materiais.algoritmoOrdenacao;

public class InsertionSort {

    public static void main(String[] args) {
        int[] X = {8, 9, 3, 5, 1};
        int i, j, eleito;

        System.out.println("Vetor desordenado");
        for (i = 0; i < 5; i++) {
            System.out.println(X[i]);
        }

        // ordenando de forma crescente
        // laço com a quatidade de elementos do vetor - 1
        for (i = 1; i < 5; i++) {
            eleito = X[i];
            j = i - 1;

            // laço que percorre os elementos a esquerda
            // do numero eleito ou ate encontrar a posicao
            // para recolocacao do numero eleito respeitando
            // a ordenacao procurada

            while (j >= 0 && X[j] > eleito) {
                X[j + 1] = X[j];
                j = j - 1;
            }

            X[j + 1] = eleito;
        }

        System.out.println("Vetor ordenado");
        for (i = 0; i < 5; i++) {
            System.out.println(X[i]);
        }

    }

}
