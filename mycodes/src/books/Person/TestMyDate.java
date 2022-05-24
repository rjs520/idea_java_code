package books.Person;

/**
 * @author rjs
 */
public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("date1: \n" + date1);
        System.out.println("\ndate2: \n" + date2);
        date2.setDate(561555550000L);
        System.out.println("\ndate2: \n" + date2);

    }
}
