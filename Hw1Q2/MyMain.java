import java.util.LinkedList;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MyMain {
    public static Integer nextIdNumber = 0;

    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            store(System.in, list);
        }

        display(System.out, list);

        assert (find("1", list) == 0)  : "Something Went Wrong 1!!";
        assert (find("2", list) == 1)  : "Something Went Wrong 2!!";
        assert (find("3", list) == 2)  : "Something Went Wrong 3!!";
        assert (find("4", list) == 3)  : "Something Went Wrong 4!!";
        assert (find("5", list) == 4)  : "Something Went Wrong 5!!";
        assert (find("6", list) == -1) : "Something Went Wrong 6!!";

    }

    public static void store(InputStream inputStream, LinkedList<Person> list) {
        Scanner inputScanner = new Scanner(inputStream);

        System.out.print("Input First Name: ");
        String firstName = inputScanner.nextLine();

        System.out.print("Input Last Name: ");
        String lastName = inputScanner.nextLine();

        Integer num = nextIdNumber++;

        // I want this to crash if we throw so I'm not gonna handle the exception
        Person person = new Person(firstName, lastName, num.toString());
        list.add(person);
    }

    public static void display(OutputStream outputStream, LinkedList<Person> list) {
        PrintStream printStream = new PrintStream(outputStream);
        for (Person person : list) {
            printStream.println(person);
        }
    }

    public static Integer find(String sid, LinkedList<Person> list) {
        for (Person person : list) {
            if (person.get_id() == sid) {
                return list.indexOf(person);
            }
        }

        return -1;
    }
}
