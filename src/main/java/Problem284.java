import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Problem284 {

    public static void main(String[] args) {

    }

    public static class PeekingIterator implements Iterator<Integer> {

        private final Queue<Integer> array;

        public PeekingIterator(Iterator<Integer> iterator) {
            array = new LinkedList<>();
            // initialize any member here.
            while (iterator.hasNext()) {
                array.add(iterator.next());
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return array.peek();
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            return array.poll();
        }

        @Override
        public boolean hasNext() {
            return array.size() > 0;
        }
    }
}
