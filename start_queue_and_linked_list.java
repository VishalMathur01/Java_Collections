import java.util.Queue;
import java.util.LinkedList;

public class start_queue_and_linked_list {
    public static void main(String[] args){
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(12);
        queue.offer(61);
        queue.offer(22);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    } 
} 