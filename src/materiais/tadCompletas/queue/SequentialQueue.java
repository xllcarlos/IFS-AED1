package materiais.tadCompletas.queue;
import materiais.tadCompletas.exceptions.Empty;
import materiais.tadCompletas.exceptions.Full;
import materiais.tadCompletas.interfaces.Queue;
import java.lang.reflect.Array;

public class SequentialQueue<T> implements Queue<T> {

    private T[] queue;
    int size;
    int begin = 0; int end = 0;

    public SequentialQueue(Class<T> tclass, int size) {
        this.queue = (T[]) Array.newInstance(tclass, size);
        this.size = size;
    }
    @Override
    public void add(T element) throws Full {

        if (fullQueue()) { throw new Full("Full queue"); }

        this.end = (this.end + 1) % this.size;
        this.queue[this.end] = element;
    }

    @Override
    public T remove() throws Empty {

        if (emptyQueue()) { throw new Empty("Empty queue"); }

        this.begin = (this.begin + 1) % this.size;
        return this.queue[this.begin];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean emptyQueue() {
        return this.begin == this.end;
    }

    @Override
    public boolean fullQueue() {
        return this.begin == ((this.end + 1) % this.size);
    }
}
