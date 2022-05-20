package experiment.experiment6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 松哥
 */
public class TestPerson2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2("Tom", 10);
        Person2 person2 = new Person2("Emma", 50);
        Person2 person3 = new Person2("Alice", 20);
        Person2 person4 = new Person2("Kate", 30);
        Person2 person5 = new Person2("Bob", 40);
        ArrayList<String> students2 = new ArrayList<>(5);
        students2.add(String.valueOf(person1));
        students2.add(String.valueOf(person2));
        students2.add(String.valueOf(person3));
        students2.add(String.valueOf(person4));
        students2.add(String.valueOf(person5));
        Collections.sort(students2);
        for (String i : students2) {
            System.out.println(i);
        }
    }
}