package Assignment.Assignment9.Problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl arrQ = new ArrayQueueImpl();

        arrQ.enqueue(10);
        arrQ.enqueue(50);
        arrQ.enqueue(600);
        arrQ.enqueue(1000);
        arrQ.dequeue();
        arrQ.dequeue();
        arrQ.dequeue();
//        arrQ.dequeue();

        System.out.println("Peek(): " + arrQ.peek());
        arrQ.displayQ();
        System.out.println("Size: " + arrQ.size());
        System.out.println("Is Empty?: " + arrQ.isEmpty());
        arrQ.enqueue(5);
        arrQ.displayQ();
    }
}
