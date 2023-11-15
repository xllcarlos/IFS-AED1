package materiais.tadCompletas.Stack;

import materiais.tadCompletas.exceptions.Empty;
import materiais.tadCompletas.exceptions.Full;

public class Main {
    public static void main(String[] args) {

        Object[] element = new Object[10];
        System.out.println(element.length);

        SequentialStack<Integer> sequentialStack = new SequentialStack<>(10);

        System.out.println(sequentialStack.full());
        System.out.println(sequentialStack.empty());

        try {
            sequentialStack.push(1);
        } catch (Full e) {
            System.out.println(e);
        }

        try {
            System.out.println(sequentialStack.pop());
        } catch (Empty e) {
            System.out.println(e);
        }

    }
}
