package experiment.experiment6;

/**
 * @author 松哥
 */
public class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return "[Person1" + name + " " + age + "]->" + super.toString();
    }

    @Override
    public int compareTo(Person1 o) {
        return 0;
    }
}
