package tad.FilaSequencial;

import tad.FilaException.FilaCheia;

public class FilaSequencial {

    int[] vetor;
    int inicio = 0;
    int fim = 0;
    int tamanho;

    public FilaSequencial(int tamanho) {
        this.vetor = new int[tamanho];
        this.tamanho = tamanho;
    }

    public boolean filaVazia() {
        /* Retorna se a lista esta vazia */
        return this.inicio == this.fim;
    }

    public boolean filaCheia() {
        /* Retorna se a lista esta cheia */
        return (this.inicio == ((this.fim + 1) % this.tamanho));
    }

    public void adicionar(int elemento) throws FilaCheia {

        if (filaCheia()) {
            throw new FilaCheia("Fila cheia");
        }

        this.fim = (this.fim + 1) % this.tamanho;
        this.vetor[this.fim] = elemento;
    }

    public int remover() {
        this.inicio = (this.inicio + 1) %  this.tamanho;
        return this.vetor[this.inicio];
    }
}
