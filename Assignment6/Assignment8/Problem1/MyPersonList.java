package Assignment.Assignment8.Problem1;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 10;

    private Person[] currentArray;
    private int numOfElements;

    public MyPersonList(){
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(Person p){
        if(p == null) return;
        if(numOfElements == currentArray.length){
            resize();
        }
        currentArray[numOfElements] = p;
        numOfElements++;
    }

    public Person get(int i){
        if(i < 0 || i >= numOfElements){
            return null;
        }
        return currentArray[i];
    }

    public void resize(){
        System.out.println("Resizing...");
        int len = currentArray.length;
        int newLen = 2 * currentArray.length;
        Person[] newArray = new Person[newLen];

        System.arraycopy(currentArray, 0, newArray, 0, len);

        currentArray = newArray;
    }

    public boolean isEmpty(){ return numOfElements == 0; }

    public boolean find(Person p){
        if (p == null) return false;
        for (int i = 0; i < numOfElements; i++){
            if(p.getLast().equals(currentArray[i].getLast())) return true;
        }
        return false;
    }

    public void insert(Person p, int pos){
        if (pos > numOfElements || pos < 0) return;
        if (numOfElements == currentArray.length){
            resize();
        }
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = p;

        System.arraycopy(currentArray, pos, temp, pos+1, currentArray.length - (pos + 1));

        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(Person p){
        if (numOfElements == 0) return false;
        if (p == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; ++i){
            if(currentArray[i].getLast().equals(p.getLast())){
                index = i;
                break;
            }
        }
        if (index == -1) return false; // Person p is not in the array
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    public Object clone(){
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList people = new MyPersonList();

        Person james = new Person("James", "Rick", 55);
        Person gavin = new Person("Gavin", "Ray", 20);
        Person gomez = new Person("Gomez", "Serena", 31);
        Person williams = new Person("Williams", "Sarah", 18);
        Person ortiz = new Person("Ortiz", "Ruiz", 22);
        Person thompson = new Person("Thompson", "Koko", 46);
        Person kennedy = new Person("Kennedy", "Frank", 39);

        people.add(james);
        people.add(gavin);
        people.add(gomez);
        people.add(williams);
        people.add(ortiz);
        people.add(thompson);
        people.add(kennedy);


        System.out.println(people.get(3));
        System.out.println(people.find(new Person("Williams", "Sarah", 18)));
        people.insert(new Person("Jamilu", "Ismail", 29), 3);
        people.remove(new Person("Kennedy", "Frank", 39));
        System.out.println(people);

    }
}
