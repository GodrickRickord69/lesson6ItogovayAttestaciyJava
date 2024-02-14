import java.util.Scanner;

public class PhoneBookMenu {
    private PhoneBook phoneBook;
    private Scanner scanner;
    public PhoneBookMenu(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        while (true) {
            System.out.println("Выберете команду: ");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Добавить номер к контакту");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Удалить номер к контакту");
            System.out.println("5. Вывести контакты");
            System.out.println("6. Выход");
            System.out.println("Команда ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    addPhoneNumber();
                    break;
                case 3:
                    removePhoneNumber();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    phoneBook.displayContacts();
                    break;
                case 6:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Не корректная команда, повторите");
            }
        }
    }
    private void addContact(){
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
    }
    private void addPhoneNumber(){
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
    }
    private void removePhoneNumber() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.removePhoneNumber(name, phoneNumber);
    }

    private void removeContact(){
        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        phoneBook.removeContact(name);
    }
}
