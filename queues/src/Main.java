import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // add = enqueue, offer()
        // remove = dequeue, poll()

        queue.offer("Mercury");
        queue.offer("Venus");
        queue.offer("Earth");
        queue.offer("Mars");
        queue.offer("Jupiter");
        queue.offer("Saturn");
        queue.offer("Uranus");
        queue.offer("Neptune");

        queue.poll();

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Venus"));
        System.out.println(queue);
    }
}