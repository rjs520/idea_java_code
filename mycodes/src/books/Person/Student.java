package books.Person;

/**
 * @author rjs
 */
public class Student extends Person {
    public String classroom;

    public Student(String name, String location, int number, String email, String classroom) {
        super(name, location, number, email);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return " Student " + name + " location " + location + " number " + number + " email " + email + " classroom " + classroom;
    }
}
