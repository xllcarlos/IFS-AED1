package materiais.tadCompletas.interfaces;

public interface Queue<T> {
    void add(T element) throws Exception;
    T remove() throws Exception;
    int getSize();
    boolean emptyQueue();
    boolean fullQueue();
}
