package Assignment.Assignment9.Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    //implement
    }
    public void enqueue(int obj){
        //implement

        //If array is full, resize()
        if(rear == arr.length - 1){
            resize();
        }

        //if Array is empty
        if(front == -1){
            front++;
            arr[front] = obj;
        } else {
            rear++;
            arr[rear] = obj;
        }
    }
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = arr[front];
        front++;
        return item;
    //implement
    }
    public boolean isEmpty(){
    //implement
        return front == -1 || front > rear;
    }
    public int size(){
    //implement
        return rear - front + 1;
    }
    private void resize(){
    //implement
        if(rear == arr.length - 1){
            System.out.println("Resizing...");
            int[] newArray = new int[arr.length * 2];
            System.arraycopy(arr, front, newArray, 0, arr.length - front);
            rear = (arr.length - 1) - front;
            front = 0;
            arr = newArray;
        }
    }

    public void displayQ(){
        for (int i = front; i < rear + 1; i++){
            System.out.println(arr[i]);
        }
    }
}
