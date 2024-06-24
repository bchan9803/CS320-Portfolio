import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // contact hashmap //
    Map<String, Object> contactHashMap = new HashMap<>();

    //  methods //
    public void addContact(Contact contact) throws MyExceptions {
        // check for duplicate contact
        if (contactHashMap.containsKey(contact.getContactID())) {
            throw new MyExceptions("Contact could not be added! Contact must have unique ID!");
        }

        // if successful, add contact to contactHashMap
        contactHashMap.put(contact.getContactID(), contact);
    };

    public void deleteContact(Contact contact) throws MyExceptions {
        // check for contactID in contactHashMap
        if (contactHashMap.containsKey(contact.getContactID())) {
            // if found, delete contact
            contactHashMap.remove(contact.getContactID());
        }
        // if not found, throw exception
        else {
            throw new MyExceptions("Contact could not be deleted! ContactID not found!");
        }
    }

    public void updateContact(Contact contact, String firstName, String lastName, String phone, String address) throws MyExceptions {
        // check for contactID in contactHashMap
        if (contactHashMap.containsKey(contact.getContactID())) {
            contact.setContactFirstName(firstName);
            contact.setContactLastName(lastName);
            contact.setContactPhone(phone);
            contact.setContactAddress(address);

            // test updated contact output
            System.out.println("contactID: " + contact.getContactID());
            System.out.println("contactFirstName: " + contact.getContactFirstName());
            System.out.println("contactLastName: " + contact.getContactLastName());
            System.out.println("contactPhone: " + contact.getContactPhone());
            System.out.println("contactAddress: " + contact.getContactAddress());
        }
        // if not found, throw exception
        else {
            throw new MyExceptions("Contact could not be updated! ContactID not found.");
        }
    }
}
