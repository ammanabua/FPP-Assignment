package Assignment.Assignment6;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();

        t.add('a', "Alpha");
        t.add('b', "Bravo");
        t.add('c', "Charlie");
        t.add('d', "Dylan");
        t.add('e', "Earl");
        t.add('f', "Fisher");
        t.add('g', "Gabriel");
        t.add('h', "Haaland");
        t.add('i', "Idara");
        t.add('j', "Jamilu");
        t.add('k', "Karina");
        t.add('l', "Lance");
        t.add('m', "Michael");
        t.add('n', "Norma");
        t.add('o', "Orlando");
        t.add('p', "Patrick");
        t.add('q', "Queen");
        t.add('r', "Rachel");
        t.add('s', "Serena");
        t.add('t', "Thomas");
        t.add('u', "Ugur");
        t.add('v', "Victoria");
        t.add('w', "Wanda");
        t.add('x', "Xena");
        t.add('y', "Yolanda");
        t.add('z', "Zachary");

        String s = t.get('a');
        System.out.println(s);
        System.out.println(t);
    }
}
