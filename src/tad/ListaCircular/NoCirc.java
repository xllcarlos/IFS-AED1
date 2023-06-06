package tad.ListaCircular;

public class NoCirc<T> {

    private T elemento;
    private NoCirc<T> proximo;
    private NoCirc<T> anterior;

    public NoCirc (T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoCirc<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoCirc<T> proximo) {
        this.proximo = proximo;
    }

    public NoCirc<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoCirc<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NoCirc{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
