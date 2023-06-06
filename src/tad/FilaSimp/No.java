package tad.FilaSimp;

public class No<T> {

    public T elemento;
    public No<T> proximo;

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

    public void clear() {
        this.elemento = null;
        this.proximo = null;
    }
    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
