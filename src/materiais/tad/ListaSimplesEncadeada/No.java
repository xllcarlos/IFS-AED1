package materiais.tad.ListaSimplesEncadeada;

public class No <T> {

    private T elemento;
    public No <T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
