package books.Person;

/**
 * @author rjs
 */
public class Employee extends Person {
    public String office;
    public int salary;
    public MyDate dtOfEmplmt;

    public Employee(String name, String location, int number, String email, String office, int salary, MyDate dtOfEmplmt) {
        super(name, location, number, email);
        this.office = office;
        this.salary = salary;
        this.dtOfEmplmt = dtOfEmplmt;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public MyDate getdtOfEmplmt() {
        return dtOfEmplmt;
    }

    public void setDtOfEmplmt(MyDate dtOfEmplmt) {
        this.dtOfEmplmt = dtOfEmplmt;
    }

    @Override
    public String toString() {
        return " Employee " + name + " location " + location + " number " + number + " email " + email + " office " + office + " salary "
                + salary + " dtOfEmplmt" + dtOfEmplmt;
    }
}
