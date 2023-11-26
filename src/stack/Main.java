package stack;

import circularQueue.CircularQueue;
import queue.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(11);
        //System.out.println("Display the front element in the circular queue : "+queue.element());
        //System.out.println("Dequeue element in the circular queue : "+queue.dequeue());
        //System.out.println("Dequeue element in the circular queue : "+queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.enqueue(133);
        queue.display();
    }
}
