public class DataTypeSelect {

    private static String determineDataType(long number){
        if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE){
            return "byte";
        } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE){
            return "short";
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
            return "int";
        } else {
            return "long";
        }
    };


    public static void main(String[] args) {

        long randomNumber = RandomNumbers.getRandomInt(0, 2_000_000_000);

        String dataType = determineDataType(randomNumber);


        System.out.println("Random Number: " + randomNumber);
        System.out.println("Suggested Data Type: " + dataType);
    }
}
