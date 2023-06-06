package tad.FilaSimp;
import tad.FilaException.*;

public class Fila<T> {

    public No<T> primeiro;
    public No<T> ultimo;
    public int tamanho = 0;

    public void enfileirar(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
        }

        this.ultimo = novoNo;
        this.tamanho++;
    }

    public T remover() throws ListaVazia {

        if (this.tamanho == 0) {
            throw new ListaVazia("Lista vazia");
        }

        No<T> noAuxiliar = new No<>(primeiro.getElemento());

        if (this.tamanho == 1) {
            this.primeiro.clear();
            this.ultimo.clear();
            this.tamanho--;
            return noAuxiliar.getElemento();
        }

        this.primeiro = primeiro.getProximo();
        this.tamanho--;
        return noAuxiliar.getElemento();
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
