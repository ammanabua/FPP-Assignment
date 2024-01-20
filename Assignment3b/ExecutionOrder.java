package Assignment.Assignment3b;

public class ExecutionOrder {

    private String str1 = "Instance Field 1";
    private String str2 = "Instance Field 2";

    private static int statStr1 = getSound();
    private static int count = 0;


    public static int getCount(){
        return count;
    }

    public static int getSound(){
        System.out.println("Boom!");
        return 1;
    }

    static{
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 1");
    }

    {
        System.out.println("Instance Block 2");
    }

    public ExecutionOrder(){
        count++;
        System.out.println("Default Constructor Execution!");
    }

    public ExecutionOrder(String a) {
        System.out.println("Parameterized Constructor Execution!");
    }

    public String getName(){
        System.out.println("Instance Method 1");
        return "Instance Method 1";
    }

    public String getType(){
        System.out.println("Instance Method 2");
        return "Instance Method 2";
    }

    public static void main(String[] args) {

        ExecutionOrder a = new ExecutionOrder();
        ExecutionOrder b = new ExecutionOrder("Run");

        a.getName();
        b.getType();


//        According to the execution order, the first thing to run are the static variables which is why which runs the getSound() method and prints "Boom" to the console. Also, the static variable count is also initialized to zero.
//
//        The next thing to be initialized are the static blocks which print to the console
//
//        After that, the instance variables "str1" & "str2" are initialized followed by the instance blocks which then print to the console.
//
//        The default constructor was called first in the main method, so that is the last thing that will exectute in the order.
//
//        Next we call the parameterized constructor which will invoke the execution order again, only this time the static variables and static blocks won't run again because they are only initialized once. Hence only the instance variables are initialized after which the instance blocks run and print to the console

//The instance methods only run when they are called, and we called them with the instances of the class created.

    }
}
