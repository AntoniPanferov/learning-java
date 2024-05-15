import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String mobileNumber, eMail, address;
    private int postcode;

    private List<Person> persons = new ArrayList<>();

    public Contact(String mobileNumber, String eMail, String address, int postcode) {
        if (mobileNumber != null && eMail != null && address != null && postcode < 0) {
            this.mobileNumber = mobileNumber;
            this.eMail = eMail;
            this.address = address;
            this.postcode = postcode;
        } else {
            throw new IllegalArgumentException("Some parameters are null.");
        }
    }
}
