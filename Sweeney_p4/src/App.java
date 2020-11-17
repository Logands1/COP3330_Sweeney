import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        TaskList taskList = new TaskList();
        Scanner scan = new Scanner(System.in);
        int input = 0;
        Menus.printMainMenu();
        while(input != 3){
            input = scan.nextInt();
            switch (input){
                case 1:
                    Menus.printNewListMenu();
                    taskList.viewList(scan.nextInt());
                    break;
                case 2:
                    taskList.loadTaskList();
                    Menus.printNewListMenu();
                    taskList.viewList(scan.nextInt());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error, Unknown Input!");
            }
        }
    }
}