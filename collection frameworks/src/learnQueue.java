import java.util.*;
public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());


    }
}
