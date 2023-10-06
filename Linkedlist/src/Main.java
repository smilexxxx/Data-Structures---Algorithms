import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

        //linkedList.pop();

        linkedList.add(5,  "F");
        linkedList.remove("D");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("O");
        linkedList.addLast("G");

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}