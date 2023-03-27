import java.util.*;

public class StackQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        System.out.println("Take 5 elements of Stack: ");
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.next());
        }
        System.out.println(stack);
        String stackPop = stack.pop();
        System.out.println("Popped element from Stack: " + stackPop);
        System.out.println(stack);
        // ---------------------- //
        Queue<String> queue = new LinkedList<>();
        System.out.println("Take 5 elements of Queue: ");
        for (int i = 0; i < 5; i++) {
            queue.add(scanner.next());
        }
        System.out.println(queue);
        String queuePop = queue.remove();
        System.out.println("Removed element from Queue: " + queuePop);
        System.out.println(queue);
    }
}
