package provaI;

public class ListaEnc<T> {

    public No<T> inicio;
    public No<T> ultimo;

    public void adicionar(T elemento) {
        No<T> no = new No<T>(elemento);

        if (inicio == null) {
            this.inicio = no;
        }
        else {
            this.ultimo.setProx(no);
        }

        this.ultimo = no;
    }

    public void incluirPosicao(T elemento, int posicao) {
        No<T> novoNo = new No<>(elemento);
        No<T> atual = inicio;
        No<T> anterior = inicio;
        int cont = 0;

        System.out.println(atual.getProx());

        if (atual.getProx() == null && cont == posicao) {
            this.inicio = novoNo;
        }

        while (atual.getProx() != null) {

            if (cont == posicao) {
                anterior.setProx(novoNo);
                novoNo.setProx(atual);
                break;
            } else {
                cont++;
                anterior = atual;
                atual = atual.getProx();
            }
        }

        if (cont == posicao && cont > 0) {
            anterior.setProx(novoNo);
            this.ultimo = novoNo;
        }
    }

    @Override
    public String toString() {
        return "ListaEnc{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                '}';
    }
}
