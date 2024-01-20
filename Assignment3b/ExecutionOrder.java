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

}
