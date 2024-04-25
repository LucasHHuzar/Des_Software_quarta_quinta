import java.util.PriorityQueue;
import java.util.Queue;

public class Trabalho {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.offer(3);
        pq.offer(5);
        pq.offer(2);
        pq.offer(1);
        pq.offer(-4);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
