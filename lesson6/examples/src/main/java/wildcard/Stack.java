package wildcard;

import java.util.*;

public class Stack<E> {
    private LinkedList<E> elements;

    public Stack() {
        elements = new LinkedList<>();
    }

    public void push(E e){
        elements.add(e);
    }

    public E pop(){
        if (elements.size() == 0)
            throw new EmptyStackException();
        return elements.removeLast();
    }

    public void pushAll(Iterable<? extends E> producer){
        for(E e : producer)
            push(e);
    }

    public void popAll(Collection<? super E> consumer){
        while (!elements.isEmpty())
            consumer.add(pop());
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(new Integer(1769));
        System.out.println(stack.pop());

        ArrayList<Integer> numberArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        stack.pushAll(numberArrayList);

        Collection<Number> numbers = new ArrayList<>();
        stack.popAll(numbers);
        System.out.println(numbers);
    }
}
