import java.util.EmptyStackException;
import java.util.Stack;

public class QueueFromStack {
    public static void main(String[] args) {
        QueueFromStack queue = new QueueFromStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.print(queue.dequeue()+" "); // Output: 1
        System.out.print(queue.dequeue()+" "); // Output: 2

        queue.enqueue(4);
        System.out.print(queue.dequeue()+" "); // Output: 3
        System.out.print(queue.dequeue()+" "); // Output: 4
    }
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public QueueFromStack() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void enqueue(int item) {
        inStack.push(item);
    }

    public int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        if (outStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return outStack.pop();
    }

    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public int size() {
        return inStack.size() + outStack.size();
    }
}
//output
//1 2 3 4