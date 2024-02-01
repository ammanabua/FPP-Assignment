package Assignment.Assignment9.Problem2;

public class SinglyLinkedStack {
//    class ListNode{
//        Object data;
//        ListNode next;
//
//        ListNode(Object item){
//            data = item;
//        }
//    }
//
//    int count;
//    ListNode head, top;
//
//
//    public SinglyLinkedStack(){
//        head = new ListNode(0);
//    }
//
//    public void push(Object obj){
//        ListNode toAdd = new ListNode(obj);
//
//        if (isEmpty()){
//            top = toAdd;
//            head.next = top;
//            top.next = null;
//        } else {
//            toAdd.next = top;
//            top = toAdd;
//            top.next = null;
//        }
//
//        count++;
//    }
//
//    public Object pop(){
//        if (isEmpty()){
//            System.out.println("Stack is Empty");
//            return null;
//        }
//        Object obj = top.data;
//        top = top.next;
//        count--;
//        return obj;
//    }
//
//    public Object peek(){
//
//        if(isEmpty()){
//            System.out.println("Stack is Empty");
//            return null;
//        }
//        return top.data;
//    }
//
//    public boolean isEmpty(){
//        return top == null;
//    }
//
//
//
//    public int size(){
//        return count;
//    }


    class Node {
        Object data;
        Node next;

        Node (Object item) {
            this.data = item;
        }
    }

    private Node top;
    int count;


    public void push (Object obj) {
        Node p = new Node (obj);
        if (isEmpty()) {
            top = p;
            top.next = null;
        } else {
            p.next = top;
            top = p;
        }
        System.out.println("Pushed: " + obj);
    };

    public Object pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }else {
            Object obj = top.data;
            top = top.next;
            return obj;
        }

    };

    public Object peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.data;
    };

    public boolean isEmpty() {
        return top == null;
    };

    public int size() {
        Node temp = this.top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}
