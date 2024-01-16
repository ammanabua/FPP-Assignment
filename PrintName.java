public class PrintName {

    public static void main(String[] args) {

        String myName = "\u00c3\u03fb\u03fb\u00e3\u00f1";
        String string = "Hi \ud83d\udc4b, my name is " + myName;
        System.out.println(string);
        System.out.println(string.length());

        //The string length combines the characters, spaces and unicode characters to calculate the string length;
    }
}
