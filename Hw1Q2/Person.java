import java.util.ArrayList;

public class Person {
    private static ArrayList<String> idList = new ArrayList<>();

    private String firstName;
    private String lastName;
    private String id;

    public Person(String firstName, String lastName, String id)  throws IllegalArgumentException {
        if (idList.contains(id)) {
            throw new IllegalArgumentException("id was not unique! id was: " + id);
        }
        else {
            idList.add(id);
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }
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