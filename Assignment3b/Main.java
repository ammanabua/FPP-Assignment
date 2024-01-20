package Assignment.Assignment3b;

public class Main {

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
