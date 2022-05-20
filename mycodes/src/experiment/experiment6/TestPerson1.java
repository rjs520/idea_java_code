package experiment.experiment6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 松哥
 */
public class TestPerson1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Tom", 10);
        Person1 person2 = new Person1("Emma", 50);
        Person1 person3 = new Person1("Alice", 20);
        Person1 person4 = new Person1("Kate", 30);
        Person1 person5 = new Person1("Bob", 24);
        ArrayList<String> students = new ArrayList<String>(5);
        students.add(String.valueOf(person1));
        students.add(String.valueOf(person2));
        students.add(String.valueOf(person3));
        students.add(String.valueOf(person4));
        students.add(String.valueOf(person5));
        Collections.sort(students);
        for (String i : students) {
            System.out.println(i);
        }
    }


}
