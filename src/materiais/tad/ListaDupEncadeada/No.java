package materiais.tad.ListaDupEncadeada;

public class No<T> {
    public T elemento;
    public No<T> proximo;
    public No<T> anterior;

    public No(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento + "}";
    }
}
