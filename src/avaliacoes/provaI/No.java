package avaliacoes.provaI;

public class No<T> {

    public T dado;
    public No<T> prox;

    No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                ", prox=" + prox +
                '}';
    }
}
