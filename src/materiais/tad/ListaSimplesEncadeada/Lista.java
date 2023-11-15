package materiais.tad.ListaSimplesEncadeada;

public class Lista<T> {

    public No<T> inicio;
    public No<T> ultimo;
    public int tamanho = 0;

    public void adicionar(T elemento) {
        No<T> no = new No<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = no;
        }
        else {
            this.ultimo.setProximo(no);
        }

        this.ultimo = no;
        this.tamanho++;
    }

    public void limpa() {

        No<T> atual = this.inicio;

        while (atual != null) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        No<T> atual = inicio;
        System.out.print(atual.getElemento() + ", ");

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            System.out.print(atual.getElemento() + ", ");
        }

        return "Lista{" +
                "inicio=" + inicio +
                '}';
    }
}
