import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        TaskApp taskApp = new TaskApp();
        ContactApp contactApp = new ContactApp();
        Scanner scan = new Scanner(System.in);
        int input = 0;
        Menus.printMainMenu();
        while(input != 3){
            input = scan.nextInt();
            switch (input){
                case 1:
                    Menus.printNewTaskSelectionMenu();
                    taskApp.TaskAppMenu(scan.nextInt());
                    break;
                case 2:
                    Menus.printNewContactSelectionMenu();
                    contactApp.ContactAppMenu(scan.nextInt());
                    break;

            }
        }
    }
}
