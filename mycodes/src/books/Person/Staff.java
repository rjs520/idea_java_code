package books.Person;

/**
 * @author rjs
 */
public class Staff extends Employee {
    public String titl;

    public Staff(String name, String location, int number, String email, String office, int salary, MyDate dtOfEmplmt, String titl) {
        super(name, location, number, email, office, salary, dtOfEmplmt);
        this.titl = titl;
    }

    @Override
    public String toString() {
        return " Staff " + name + " location " + location + " number " + number + " email " + email + " office " + office + " salary "
                + salary + "dtOfEmplmt" + dtOfEmplmt + " titl " + titl;
    }
}
