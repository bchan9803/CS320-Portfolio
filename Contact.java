public class Contact {
    // variables
    private String contactID;
    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;
    private String contactAddress;

    // default constructor
    public Contact() {}

    // constructor
    public Contact(
            String contactID,
            String contactFirstName,
            String contactLastName,
            String contactPhone,
            String contactAddress
    ) throws MyExceptions {
        // setters added to constructor in order to provide input validation
        this.setContactID(contactID);
        this.setContactFirstName(contactFirstName);
        this.setContactLastName(contactLastName);
        this.setContactPhone(contactPhone);
        this.setContactAddress(contactAddress);
    }

    // getters
    public String getContactID() {
        return contactID;
    };
    public String getContactFirstName() {
        return contactFirstName;
    };
    public String getContactLastName() { return contactLastName; };
    public String getContactPhone() {
        return contactPhone;
    };
    public String getContactAddress() { return contactAddress; };

    // setters
    public void setContactID(String contactID) throws MyExceptions {
        // check for contactID value (must not be null)
        if (contactID == null) {
            throw new MyExceptions("contactID cannot be null!");
        }
        // check for contactID length (must not exceed 10)
        if (contactID.length() > 10) {
            throw new MyExceptions("contactID length cannot exceed 10!");
        }
        // add contactID if successful
        else {
            this.contactID = contactID;
        }
    };

    public void setContactFirstName(String contactFirstName) throws MyExceptions {
        // check for contactFirstName value (must not be null)
        if (contactFirstName == null) {
            throw new MyExceptions("contactFirstName cannot be null!");
        }
        // check if contactFirstName length exceeds 10
        if (contactFirstName.length() > 10) {
            throw new MyExceptions("contactFirstName length cannot exceed 10!");
        }
        // add contactFirstName if successful
        else {
            this.contactFirstName = contactFirstName;
        }
    };

    public void setContactLastName(String contactLastName) throws MyExceptions {
        // check for contactLastName value (must not be null)
        if (contactLastName == null) {
            throw new MyExceptions("contactLastName cannot be null!");
        }
        // check if contactLastName length exceeds 10
        if (contactLastName.length() > 10) {
            throw new MyExceptions("contactLastName length cannot exceed 10!");
        }
        // add contactLastName if successful
        else {
            this.contactLastName = contactLastName;
        }
    };

    public void setContactPhone(String contactPhone) throws MyExceptions {
        // check for contactPhone value (must not be null)
        if (contactPhone == null) {
            throw new MyExceptions("contactPhone cannot be null!");
        }
        // check if contactPhone length must be 10
        if (contactPhone.length() != 10) {
            throw new MyExceptions("contactPhone length must be 10!");
        }
        // add contactPhone if successful
        else {
            this.contactPhone = contactPhone;
        }
    };

    public void setContactAddress(String contactAddress) throws MyExceptions {
        // check for contactAddress value (must not be null)
        if (contactAddress == null) {
            throw new MyExceptions("contactAddress cannot be null!");
        }
        // check if contactAddress length exceeds 30
        if (contactAddress.length() > 30) {
            throw new MyExceptions("contactAddress length cannot exceed 30!");
        }
        // add contactAddress if successful
        else {
            this.contactAddress = contactAddress;
        }
    };
}
