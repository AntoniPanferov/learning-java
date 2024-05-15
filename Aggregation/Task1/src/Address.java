public class Address {
    private String street;
    private String postcode;
    private String city;

    public Address(String street, String postcode, String city) {
        if (street == null || street.isEmpty()) {
            throw new IllegalArgumentException("Street cannot be null or empty");
        }

        if (postcode == null || postcode.isEmpty()) {
            throw new IllegalArgumentException("Postcode cannot be null or empty");
        }

        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }

        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }
}
