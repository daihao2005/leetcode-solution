import java.util.Collections;
import java.util.PriorityQueue;

public class Problem295 {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(1);
        queue.add(2);
        queue.add(-1);
        Integer i;
        while ((i = queue.poll()) != null) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
