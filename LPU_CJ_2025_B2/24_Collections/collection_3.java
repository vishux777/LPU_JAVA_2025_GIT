// Deque -> Doubly ended queue -> insert and remove elements from both the ends
// this can work both Queue (FIFO) and stack (LIFO)

import java.util.ArrayDeque;
import java.util.Deque;

public class collection_3 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        //add
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        //queue looks like this -> A <- B <- C

        // remove
        // dq.removeFirst(); //remove A
        // dq.removeLast(); //remove C

        //peek
        // dq.peekFirst(); //A
        // dq.peekLast(); //C

        //use deque as stack
        // dq.pop();
        // dq.pollLast();
    }
}
