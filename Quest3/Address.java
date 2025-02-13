package Quest3;

public class Address {
    private String street, city, state, zip;

    // construct
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // convert to string
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
