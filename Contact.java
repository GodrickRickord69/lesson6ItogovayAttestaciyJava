import java.util.ArrayList;
import java.util.List;

public class Contact {
    String name;
    List<String> phoneNumbers;

    Contact(String user_name, String phoneNomber){
    this.name = name;
    this.phoneNumbers = new ArrayList<>();
    this.phoneNumbers.add(phoneNomber);
}
    String getUser_name(){
    return name;
}
    List<String> getPhoneNumbers(){
    return phoneNumbers;
}
    void removePhoneNumbers(String phoneNomber){
        phoneNombers.remove(phoneNomber);
    }
}
