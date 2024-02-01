package Assignment.Assignment9.Problem2;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedStack slt = new SinglyLinkedStack();

        slt.push("Jay");
        slt.push("Kevin");
        slt.push("Tunde");
        slt.push("Ojay");
        slt.push("Kayode");
        System.out.println("Popped(): " + slt.pop());
//        System.out.println("Popped(): " + slt.pop());
//        System.out.println("Popped(): " + slt.pop());
//        System.out.println("Popped(): " + slt.pop());


        System.out.println("Top of the Stack: " + slt.peek());
        System.out.println("Size of the Stack: " + slt.size());
        System.out.println("Is the stack Empty?: " + slt.isEmpty());
    }
}
