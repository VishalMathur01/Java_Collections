import java.util.PriorityQueue;
public class start_priority_queue {
 public static void main(String[] args){

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // for reverse order Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    
    pq.offer(32);
    pq.offer(40);
    pq.offer(55);
    pq.offer(23);

    System.out.println(pq);
    pq.poll();

    System.out.println(pq);
    System.out.println(pq.peek());
 
 }   
}
