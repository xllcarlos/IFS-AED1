package materiais.tad.PilhaEncadeada;

public class NoPilha<T> {

    public T elemento;
    public NoPilha<T> proximo;

    public NoPilha(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoPilha<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoPilha<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
