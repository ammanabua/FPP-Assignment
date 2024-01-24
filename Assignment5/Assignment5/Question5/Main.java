package Assignment.Assignment5.Question5;

public class Main {
    public static void main(String[] args) {

        Computer comp = new Computer("Hewlett Packard", "Intel Core i7", 32, 3.5);

        Computer test = new Computer("Hewlett Packard", "Intel Core i7", 64, 3.5);

        System.out.println(comp.equals(test));
        System.out.println(comp.hashCode());
        System.out.println(test.hashCode());

    }
}
