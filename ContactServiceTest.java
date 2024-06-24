import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    ContactService service = new ContactService();

    // test add contact //
    @Test
    void testAddContact() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Oak Dr");

        // test adding contact
        Assertions.assertDoesNotThrow(()-> {
            service.addContact(contact);
        });
    }
    @Test
    void testAddContactWithDuplicateID() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Oak Dr");
        service.addContact(contact);

        Contact contact2 = new Contact("12345", "Bill", "Dance", "8001112222", "444 Flounder St");

        // test adding contact with duplicate ID
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.addContact(contact2);
        });
    }


    // test delete contact //
    @Test
    void testDeleteContact() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Oak Dr");
        service.addContact(contact);

        // test deleting contact
        Assertions.assertDoesNotThrow(()-> {
            service.deleteContact(contact);
        });
    }
    @Test
    void testDeleteContactIDNotFound() throws MyExceptions {
        Contact contact = new Contact();

        // test deleting contact with non-existent contactID
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.deleteContact(contact);
        });
    }


    // test update contact //
    @Test
    void testUpdateContact() throws MyExceptions {
        Contact contact = new Contact("12345", "Bryan", "Chan", "8001112222", "321 Oak Dr");
        service.addContact(contact);

        String firstName = "Jimmy";
        String lastName = "Houston";
        String phone = "8003334444";
        String address = "456 Lake Cir";

        // test updating contact
        Assertions.assertDoesNotThrow(()-> {
            service.updateContact(contact, firstName, lastName, phone, address);
        });
    }
    @Test
    void testUpdateContactIDNotFound() throws MyExceptions {
        Contact contact = new Contact();

        String firstName = "Jimmy";
        String lastName = "Houston";
        String phone = "8003334444";
        String address = "456 Lake Cir";

        // test updating contact with non-existent contactID
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.updateContact(contact, firstName, lastName, phone, address);
        });
    }
}
