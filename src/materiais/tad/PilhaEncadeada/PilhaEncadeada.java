package materiais.tad.PilhaEncadeada;

public class PilhaEncadeada<T> {

    public NoPilha<T> topo;
    public int tamanho = 0;

    public void enfileirar(T elemento) {
        NoPilha<T> novoNo = new NoPilha<>(elemento);

        if (this.tamanho > 0) {
            novoNo.setProximo(topo);
        }

        this.topo = novoNo;
        this.tamanho++;
    }

    public T remover() {
        T elemento = topo.getElemento();
        this.topo = topo.getProximo();
        this.tamanho--;

        return elemento;
    }
}
