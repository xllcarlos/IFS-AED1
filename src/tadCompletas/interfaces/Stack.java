package tadCompletas.interfaces;

import tadCompletas.exceptions.Empty;
import tadCompletas.exceptions.Full;

public interface Stack<T> {
    public abstract void push(T element) throws Full;
    public abstract T pop() throws Empty;
    public abstract boolean empty();
    public abstract boolean full();
}
