import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<String> phoneNumbers;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);
}
    public String getName(){
        return name;
}
    public List<String> getPhoneNumbers(){
        return phoneNumbers;
}
    public void removePhoneNumber(String phoneNumber){
        phoneNumbers.remove(phoneNumber);
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }
}
