package tad.ListaDupEncadeada;

import provaI.ListaEnc;

public class ListaDup<T> {

    public No<T> inicio;
    public No<T> ultimo;
    public int tamanho = 0;

    public ListaDup(){
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void adicionar(T elemento){
        No<T> novoNo = new No<>(elemento);

        novoNo.setProximo(null);
        novoNo.setAnterior(ultimo);

        if(inicio == null){
            inicio = novoNo;
        }
        if(ultimo != null){
            ultimo.setProximo(novoNo);
        }
        ultimo = novoNo;
        tamanho++;
    }

    public ListaDup<T> subLista(int posInicio, int posFim) {
        ListaDup<T> sublista = new ListaDup<>();
        No<T> noAuxiliar = inicio;

        for (int i = 0; i <= posFim; i++) {
            if (i >= posInicio) {
                sublista.adicionar(noAuxiliar.getElemento());
            }
            noAuxiliar = noAuxiliar.getProximo();
        }

        return sublista;
    }

    public void adicionarPosicao(int pos, T elemento){
        No<T> noAuxiliar = inicio;

        for(int i=0; (i < pos) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximo();
        }

        No<T> novoNo = new No<>(elemento);

        novoNo.setProximo(noAuxiliar);

        if(novoNo.getProximo() != null){
            novoNo.setAnterior(noAuxiliar.getAnterior());
            novoNo.getProximo().setAnterior(novoNo);
        }else{
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        }

        if(pos == 0){
            inicio = novoNo;
        }else{
            novoNo.getAnterior().setProximo(novoNo);
        }
        tamanho++;
    }

    @Override
    public String toString() {

        No<T> noAuxiliar = inicio;
        String string = "";

        for(int i = 0; i < this.tamanho; i++){

            string += "[No {conteudo=" + noAuxiliar.getElemento() + "}, próximo";
            noAuxiliar = noAuxiliar.getProximo();
        }
        string += "fim";

        return string;
    }
}
