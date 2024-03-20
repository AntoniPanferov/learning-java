import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = createRandomQueue(10, 50);

        System.out.println(queue);
        System.out.println(convertQueueToStack(queue));

    }

    static Random random  = new Random();
    private static Queue<Integer> createRandomQueue(int length, int upperBoundary) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            queue.offer(random.nextInt(upperBoundary + 1));
        }
        return queue;
    }

    private static Stack<Integer> convertQueueToStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        return stack;
    }

    private static Stack<Integer> reverseStack(Stack<Integer> originalStack) {
        Stack<Integer> reversedStack = originalStack;

        //for (int = 0; i < reversedStack.)

        return reversedStack;
    }
}