import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactTest {
    // for contactID //
    @Test
    void testContactID() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactID is right length
        assertTrue(contact.getContactID().length() < 11);
        // check if contactID is not null
        assertTrue(contact.getContactID() != null);
    }

    // positives:
    @Test
    void testContactIDRightLength() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactID is right length
        assertTrue(contact.getContactID().length() < 11);
    }
    @Test
    void testContactIDNotNull() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactID is not null
        assertTrue(contact.getContactID() != null);
    }

    // negatives:
    @Test
    void testContactIDNull() {
        // check if contactID is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Contact(null, "Bryan", "Chan", "8001112222", "321 Straight Ln");
        });
    }
    @Test
    void testContactIDTooLong() {
        // check if contactID is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Contact("1234567891011", "Bryan", "Chan", "8001112222", "321 Straight Ln");
        });
    }


    // for contactFirstName //
    @Test
    void testContactFirstName() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactFirstName is right length
        assertTrue(contact.getContactFirstName().length() < 11);
        // check if contactFirstName is not null
        assertTrue(contact.getContactFirstName() != null);
    }

    // positives
    @Test
    void testContactFirstNameRightLength() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactFirstName is right length
        assertTrue(contact.getContactFirstName().length() < 11);
    }
    @Test
    void testContactFirstNameNotNull() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactFirstName is not null
        assertTrue(contact.getContactFirstName() != null);
    }

    // negatives
    @Test
    void testContactFirstNameTooLong() {
        // check if contactFirstName is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", "This first name is way too long", "Chan", "8001112222", "321 Straight Ln");
        });
    }
    @Test
    void testContactFirstNameNull() {
        // check if contactFirstName is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", null, "Chan", "8001112222", "321 Straight Ln");
        });
    }


    // for contactLastName //
    @Test
    void testContactLastName() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactLastName is right length
        assertTrue(contact.getContactLastName().length() < 11);
        // check if contactLastName is not null
        assertTrue(contact.getContactLastName() != null);
    }

    // positives
    @Test
    void testContactLastNameRightLength() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactLastName is right length
        assertTrue(contact.getContactLastName().length() < 11);
    }
    @Test
    void testContactLastNameNotNull() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactLastName is not null
        assertTrue(contact.getContactLastName() != null);
    }

    // negatives
    @Test
    void testContactLastNameTooLong() {
        // check if contactLastName is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", "Bryan", "This last name is way too long", "8001112222", "321 Straight Ln");
        });
    }
    @Test
    void testContactLastNameNull() {
        // check if contactLastName is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", null, "Chan", "8001112222", "321 Straight Ln");
        });
    }


    // for contactPhone //
    @Test
    void testContactPhone() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactPhone is right length
        assertTrue(contact.getContactPhone().length() == 10);
        // check if contactPhone is not null
        assertTrue(contact.getContactPhone() != null);
    }

    // positives
    @Test
    void testContactPhoneRightLength() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactPhone is right length
        assertTrue(contact.getContactPhone().length() == 10);
    }
    @Test
    void testContactPhoneNotNull() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactPhone is not null
        assertTrue(contact.getContactPhone() != null);
    }

    // negatives
    @Test
    void testContactPhoneTooLong() {
        // check if contactPhone is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", "Bryan", "Chan", "80011122223333", "321 Straight Ln");
        });
    }
    @Test
    void testContactPhoneNull() {
        // check if contactPhone is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", null, "Chan", null, "321 Straight Ln");
        });
    }


    // for contactAddress //
    @Test
    void testContactAddress() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactAddress is right length
        assertTrue(contact.getContactAddress().length() < 31);
        // check if contactAddress is not null
        assertTrue(contact.getContactAddress() != null);
    }

    // positives
    @Test
    void testContactAddressRightLength() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactAddress is right length
        assertTrue(contact.getContactAddress().length() < 31);
    }
    @Test
    void testContactAddressNotNull() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Straight Ln");

        // check if contactAddress is not null
        assertTrue(contact.getContactAddress() != null);
    }

    // negatives
    @Test
    void testContactAddressTooLong() {
        // check if contactAddress is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "This address is waaaaaaaay too long");
        });
    }
    @Test
    void testContactAddressNull() {
        // check if contactAddress is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            Contact contact = new Contact("12345", null, "Chan", "8001112222", null);
        });
    }
}
