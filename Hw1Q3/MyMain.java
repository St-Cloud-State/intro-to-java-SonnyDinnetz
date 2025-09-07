import java.util.LinkedList;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MyMain {
    public static void main(String[] args) {
        PersonList list = new PersonList();

        for (int i = 0; i < 5; i++) {
            list.store();
        }

        list.display();

        assert (list.find("1") == 0)  : "Something Went Wrong 1!!";
        assert (list.find("2") == 1)  : "Something Went Wrong 2!!";
        assert (list.find("3") == 2)  : "Something Went Wrong 3!!";
        assert (list.find("4") == 3)  : "Something Went Wrong 4!!";
        assert (list.find("5") == 4)  : "Something Went Wrong 5!!";
        assert (list.find("6") == -1) : "Something Went Wrong 6!!";
    }
}
