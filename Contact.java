import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<String> phoneNumbers;

    public Contact(String user_name, String phoneNomber){
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNomber);
}
    public String getName(){
        return name;
}
    public List<String> getPhoneNumbers(){
        return phoneNumbers;
}
    public void removePhoneNumbers(String phoneNomber){
        phoneNombers.remove(phoneNomber);
    }
}
