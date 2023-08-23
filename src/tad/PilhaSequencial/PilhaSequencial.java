package tad.PilhaSequencial;

public class PilhaSequencial<T> {

    public T[] pilha;
    public int tamanho;
    public int posicao = 0;

    public PilhaSequencial(int tamanho) {
        this.pilha = (T[]) new Object[tamanho];
        this.tamanho = tamanho;
    }

    public void enfileirar(T elemento) {
        this.pilha[posicao] = elemento;
        this.posicao++;
    }

    public T remover() {
        this.posicao--;

        return this.pilha[posicao];
    }
}
