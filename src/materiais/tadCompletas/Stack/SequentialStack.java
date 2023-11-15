package materiais.tadCompletas.Stack;

import materiais.tadCompletas.exceptions.Empty;
import materiais.tadCompletas.exceptions.Full;
import materiais.tadCompletas.interfaces.Stack;

public class SequentialStack<T> implements Stack<T> {

    public Object[] elements;
    public int size;
    public int head = -1;

    public SequentialStack(int size) {
        this.elements = new Object[size];
        this.size = size;
    }

    @Override
    public void push(T element) throws Full {

        if (full()) {
            throw new Full("Cheio");
        }

        this.head++;
        this.elements[this.head] = element;

    }

    @Override
    public T pop() throws Empty {

        if (empty()) {
            throw new Empty("Vazia");
        }

        T element = (T) this.elements[this.head];
        this.elements[this.head] = head;
        this.head--;

        return element;
    }

    @Override
    public boolean empty() {
        return this.head == -1;
    }

    @Override
    public boolean full() {
        return this.head == this.size;
    }
}
