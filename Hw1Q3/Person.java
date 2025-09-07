import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String id;

    public Person(String firstName, String lastName, String id)  throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String get_firstName() {return firstName;}
    public String get_lastName() {return lastName;}
    public String get_id() {return id;}

    @Override
    public String toString() {
        return "First Name: " + firstName 
             + " Last Name: " + lastName 
             + " id: " + id;
    }
}