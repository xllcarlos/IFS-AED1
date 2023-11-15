package materiais.tad.FilaDup;

public class FilaDup<T> {

    private NoDup<T> primeiro;
    private NoDup<T> ultimo;
    private int tamanho = 0;

    public void enfileirar(T elemento) {
        NoDup<T> novoNo = new NoDup<>(elemento);

        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
        }

        this.ultimo = novoNo;
        this.tamanho++;
    }

    public T remover() {
        NoDup<T> noAuxiliar = new NoDup<>(primeiro.getElemento());

        if (this.tamanho == 1) {
            this.primeiro.clear();
            this.ultimo.clear();
            this.tamanho--;
            return noAuxiliar.getElemento();
        }

        this.primeiro = primeiro.getProximo();
        this.primeiro.setAnterior(null);
        this.tamanho--;
        return noAuxiliar.getElemento();
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
