import java.util.*;

public class PhoneBook {
    Map<String, Contact> contacts;

    PhoneBook(){
        contacts = new HashMap<>();
    }

    void addContact(String name, String phoneNumber){
        if (contacts.containsKey(name)){
            contacts.get(name).addPhoneNomber(phoneNumber);
        } else {
            Contact contact = new Contact(name, phoneNumber);
            contacts.put(name, contact);
        }
    void removeContact(String name){
            contacts.remove(name);
        }
    void removePhoneNumber(String name, String phoneNumber) {
            if (contacts.containsKey(name)) {
                contacts.get(name).removePhoneNumbers(phoneNumber);
            }
        }
    void displayContacts() {
            List<Contact> sortedContacts = new ArrayList<>(contacts.values());
            sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumbers().size()));
            for (Contact contact: sortedContacts){
                System.out.println(contact.getUser_name() + ":" + contact.getPhoneNumbers());
            }
        }
    }
}
