package books.Person;

/**
 * @author rjs
 */
public class Person {
    public String name;
    public String location;
    public int number;
    public String email;

    public Person(String name, String location, int number, String email) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public String email() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " name " + name + " location "
                + location + " number " +
                number + " email " + email;
    }

}
