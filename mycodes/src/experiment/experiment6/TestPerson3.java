package experiment.experiment6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 松哥
 */
public class TestPerson3 {
    public static void main(String[] args) {
        Person3 person1 = new Person3("Tom", 10);
        Person3 person2 = new Person3("Emma", 50);
        Person3 person3 = new Person3("Alice", 20);
        Person3 person4 = new Person3("Kate", 10);
        Person3 person5 = new Person3("Bob", 40);
        ArrayList<String> students3 = new ArrayList<>(5);
        students3.add(String.valueOf(person1));
        students3.add(String.valueOf(person2));
        students3.add(String.valueOf(person3));
        students3.add(String.valueOf(person4));
        students3.add(String.valueOf(person5));
        Collections.sort(students3);
        for (String i : students3) {
            System.out.println(i);
        }
    }
}
