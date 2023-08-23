package provaII;

interface Pilha<T> {
    public void setFatorAlocacao(float percentual) throws IllegalArgumentException;
    public T desempilhar() throws PilhaVaziaException;
    public T topo() throws PilhaVaziaException;
}

class PilhaVaziaException extends Exception {
    PilhaVaziaException(String message) {
        super(message);
    }
}
public class PilhaInteiros<T> implements Pilha<T> {
    private static final int TAMANHO_INICIAL = 10;
    private static final float FATOR_EXPANSAO = 1.5f;
    private static final float FATOR_REDUCO = 0.5f;

    private Object[] elementos;
    private int topo;
    private float fatorAlocacao;

    public PilhaInteiros() {
        elementos = new Object[TAMANHO_INICIAL];
        topo = -1;
        fatorAlocacao = 0.5f; // Fator de ocupação inicial padrão
    }

    public void setFatorAlocacao(float percentual) throws IllegalArgumentException {
        if (percentual < 0.0f || percentual > 1.0f) {
            throw new IllegalArgumentException("O percentual deve estar entre 0 e 1");
        }

        fatorAlocacao = percentual;
        ajustarTamanho();
    }

    public void empilhar(T valor) {
        ajustarTamanho();

        topo++;
        elementos[topo] = valor;
    }

    public T desempilhar() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }

        T valor = (T) elementos[topo];
        elementos[topo] = null;
        topo--;

        ajustarTamanho();

        return valor;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public T topo() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }

        return (T) elementos[topo];
    }

    public void limpar() {
        for (int i = 0; i <= topo; i++) {
            elementos[i] = null;
        }

        topo = -1;
    }

    private void ajustarTamanho() {
        int capacidadeAtual = elementos.length;
        int tamanhoMinimo = Math.round(capacidadeAtual * fatorAlocacao);
        int tamanhoMaximo = Math.round(capacidadeAtual / fatorAlocacao);

        if (topo + 1 > tamanhoMaximo) {
            int novoTamanho = Math.round(capacidadeAtual * FATOR_EXPANSAO);
            redimensionar(novoTamanho);
        } else if (topo + 1 < tamanhoMinimo) {
            int novoTamanho = Math.round(capacidadeAtual * FATOR_REDUCO);
            redimensionar(novoTamanho);
        }
    }

    private void redimensionar(int novoTamanho) {
        Object[] novaPilha = new Object[novoTamanho];

        for (int i = 0; i <= topo; i++) {
            novaPilha[i] = elementos[i];
        }

        elementos = novaPilha;
    }
}