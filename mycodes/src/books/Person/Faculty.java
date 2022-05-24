package books.Person;

/**
 * @author rjs
 */
public class Faculty extends Employee {
    public MyDate officetime;
    public String level;

    public Faculty(String name, String location, int number, String email, String office, int salary, MyDate dtOfEmplmt, MyDate officetime, String level) {
        super(name, location, number, email, office, salary, dtOfEmplmt);
        this.officetime = officetime;
        this.level = level;
    }

    @Override
    public String toString() {
        return " Faculty " + name + " location " + location + " number " + number + " email " + email + " office " + office + " salary "
                + salary + "dtOfEmplmt" + dtOfEmplmt + " officetime " + officetime + " leve " + level;
    }
}
