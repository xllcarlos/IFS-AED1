package materiais.tad.FilaDup;

public class NoDup<T> {

    private T elemento;
    private NoDup<T> proximo;
    private NoDup<T> anterior;

    public NoDup(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoDup<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDup<T> proximo) {
        this.proximo = proximo;
    }

    public NoDup<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDup<T> anterior) {
        this.anterior = anterior;
    }

    public void clear() {
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }

    @Override
    public String toString() {
        return "NoDup{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
