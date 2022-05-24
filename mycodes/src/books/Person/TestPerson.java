package books.Person;

/**
 * @author rjs
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Tom", "A", 110, "163@qq.com");
        Student student = new Student("John", "B", 109, "@165qq.com", "jrYr");
        Employee employee = new Employee("Alice", "C", 108, "@168qq.com", "Tencet", 9999, new MyDate(2001, 8, 29));
        Faculty faculty = new Faculty("Bob", "D", 107, "@167qq.com", "Wc", 8888, new MyDate(2001, 8, 27), new MyDate(2003, 7, 14), "SSR");
        Staff staff = new Staff("Cat", "E", 106, "109@qq.com", "QTC", 7777, new MyDate(2005, 7, 12), "BOSS");

        System.out.println(person.toString());
        System.out.println("--------------------------");
        System.out.println(student.toString());
        System.out.println("--------------------------");
        System.out.println(employee.toString());
        System.out.println("--------------------------");
        System.out.println(faculty.toString());
        System.out.println("--------------------------");
        System.out.println(student.toString());
    }
}
