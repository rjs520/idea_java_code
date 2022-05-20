package experiment.experiment6;

/**
 * @author 松哥
 */
public class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return "[Person2" + age + " " + name + "]->" + super.toString();
    }

    @Override
    public int compareTo(Person2 o) {
        return 0;
    }
}
