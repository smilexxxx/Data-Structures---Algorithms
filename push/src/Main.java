import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Youtube");
        stack.push("WhatsApp");
        stack.push("Tiktok");
        stack.push("Instagram");

        stack.pop(); //removes last item in the list

        System.out.println(stack.peek());

        System.out.println(stack);
    }
}