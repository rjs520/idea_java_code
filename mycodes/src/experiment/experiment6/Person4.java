package experiment.experiment6;

/**
 * @author 松哥
 */
public class Person4 implements Cloneable {
    private String name;
    private int age;

    public Person4(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "[Person " + name + " " + age + "]->" + super.toString();
    }

}
