import java.util.Stack;
import java.util.stream.IntStream;

public class DataStructure {

    static void stack_push(Stack<Integer> stack) {
        IntStream.range(0, 5).forEachOrdered(stack::push);
    }

    static void stack_pop(Stack<Integer> stack) {

        IntStream.range(0, 5).mapToObj(i -> stack.pop()).forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        stack_pop(stack);
    }
}