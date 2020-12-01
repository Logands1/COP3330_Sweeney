import java.io.IOException;
import java.util.Scanner;

public class ContactApp {
    public void ContactAppMenu(int input) throws IOException {
        ContactList contactList = new ContactList();
        Scanner scan = new Scanner(System.in);

        while (input !=3){
            switch (input){
                case 1:
                    Menus.printNewContactListMenu();
                    contactList.selectContactList(scan.nextInt());
                    input = scan.nextInt();
                    break;
                case 2:
                    contactList.loadTaskList();
                    Menus.printNewContactListMenu();
                    contactList.selectContactList(scan.nextInt());
                    input = scan.nextInt();
                    break;


            }
        }
        Menus.printMainMenu();
    }
}
