import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonList {
    private Integer nextIdNumber;
    private LinkedList<Person> list;

    public PersonList() {
        this.list = new LinkedList<Person>();
        this.nextIdNumber = 0;
    }

    public void store() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Input First Name: ");
        String firstName = inputScanner.nextLine();

        System.out.print("Input Last Name: ");
        String lastName = inputScanner.nextLine();

        Integer num = nextIdNumber++; // If I was gonna implement a "remove" function I'd do some checking to ensure that ID is unique.

        Person person = new Person(firstName, lastName, num.toString());
        list.add(person);
    }

    public void display() {
        PrintStream printStream = new PrintStream(System.out);
        for (Person person : list) {
            printStream.println(person);
        }
    }

    public Integer find(String sid) {
        for (Person person : list) {
            if (person.get_id() == sid) {
                return list.indexOf(person);
            }
        }

        return -1;
    }
}
