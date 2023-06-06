package tad.ListaCircular;

public class ListaCirc<T> {

    private NoCirc<T> primeiro;
    private NoCirc<T> ultimo;
    private int tamanho = 0;

    public void adicionar(T elemento) {
        NoCirc<T> novoNo = new NoCirc<>(elemento);

        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            novoNo.setAnterior(ultimo);
            this.ultimo.setProximo(novoNo);
        }

        this.ultimo = novoNo;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
