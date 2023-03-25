package entities;

public class Address {
    //city, state, country
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return "Address: " + city + ", " + state + ", " + country;
    }
}
