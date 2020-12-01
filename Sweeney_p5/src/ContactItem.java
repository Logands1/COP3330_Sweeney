import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContactItem implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public ContactItem(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);

    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setFirstName(String firstName) throws NullPointerException {
        if (firstName.trim().equals("") || firstName == null) {
            throw new NullPointerException("\nERROR: Title must contain at least 1 character!\n");
        } else {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
