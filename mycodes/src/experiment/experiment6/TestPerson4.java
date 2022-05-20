package experiment.experiment6;

import java.util.ArrayList;

/**
 * @author 松哥
 */
public class TestPerson4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person4 person4 = new Person4("Tob", 17);
        Person4 person41 = (Person4) person4.clone();
        ArrayList<String> student4 = new ArrayList<>();
        student4.add(String.valueOf(person4));
        student4.add(String.valueOf(person41));

        for (String i : student4) {
            System.out.println(i);
        }
    }
}
