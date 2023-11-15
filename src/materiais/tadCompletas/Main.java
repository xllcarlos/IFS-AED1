package materiais.tadCompletas;

import materiais.tadCompletas.queue.SequentialQueue;
import materiais.tadCompletas.exceptions.Empty;
import materiais.tadCompletas.exceptions.Full;

public class Main {
    public static void main(String[] args) {

        {
            SequentialQueue<Integer> sequentialQueue = new SequentialQueue<>(Integer.class, 4);

            try {
                sequentialQueue.add(1);
                sequentialQueue.add(4);
                sequentialQueue.add(3);
            } catch (Full e) {
                System.out.println(e);
            }

            try {
                System.out.println(sequentialQueue.remove());
                System.out.println(sequentialQueue.remove());
                System.out.println(sequentialQueue.remove());
            } catch (Empty e) {
                System.out.println(e);
            }

        }
    }
}
