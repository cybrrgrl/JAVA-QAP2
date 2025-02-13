package Quest3;

public class Person {
    private String lastName, firstName;
    private Address home;

    // construct
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // convert to string
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}
