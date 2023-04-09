import java.util.*;
public class learnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(120);
        pq.offer(125);
        pq.offer(13);
        pq.offer(20);
        pq.offer(135);

        System.out.println("Priority is set by heap"+ pq);
        System.out.println(pq.poll());
        System.out.println("Priority is set by heap"+ pq);


    }
}
