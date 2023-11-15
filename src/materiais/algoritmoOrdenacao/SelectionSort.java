package materiais.algoritmoOrdenacao;

public class SelectionSort {

    public static void main (String[] args) {
        int[] X = {8, 9, 3, 5, 1};
        int n = 5;
        int i, j, eleito, menor, pos;

        System.out.println("Vetor desordenado");
        for (i = 0; i < 5; i++) {
            System.out.println(X[i]);
        }

        // ordenando de forma crescente laço que
        // percorre da 1 posicao a penultina posiçao
        // do vetor elegendo um numero para ser comparado

        for (i = 0; i < n - 1; i++) {

            eleito = X[i];

            // encontrando o menor numero a direita do
            // eleito com sua respectiva posicao
            // posicao do eleito = i
            // primeiro numero a direita do eleito
            // na posicao = i + 1

            menor = X[i + 1];
            pos = i + 1;

            // laço que percorre os elementos que estao
            // a direita do numero eleito, retornando o menor
            // numero a direita e sua posicao

            for (j = i + 2; j < n; j++) {
                if (X[j] < menor) {
                    menor = X[j];
                    pos = j;
                }
            }

            // troca do numero eleito com o numero da pos
            // o numero da posicao pos e o menor numero
            // a fireita do numero eleito

            if (menor < eleito) {
                X[i] = X[pos];
                X[pos] = eleito;
            }
        }

        // mostrando vetor ordenado
        System.out.println("Vetor ordenado");
        for (i = 0; i < n; i++) {
            System.out.println(X[i]);
        }
    }
}
