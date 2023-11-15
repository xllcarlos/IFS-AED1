package materiais.tadCompletas.interfaces;

import materiais.tadCompletas.exceptions.Empty;
import materiais.tadCompletas.exceptions.Full;

public interface Stack<T> {
    public abstract void push(T element) throws Full;
    public abstract T pop() throws Empty;
    public abstract boolean empty();
    public abstract boolean full();
}
