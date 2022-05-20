package experiment.experiment6;

/**
 * @author 松哥
 */
public class Person3 implements Comparable<Person3> {
    private String name;

    private int age;

    public Person3(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person3 o) {
        if (age < o.age) {
            return -1;
        } else if (age == o.age) {
            char a = name.charAt(0);
            char b = o.name.charAt(0);
            if (a < b) {
                return -1;
            } else if (a == b) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public String toString() {
        return "[Person3" + age + " " + name + "]->" + super.toString();
    }
}
