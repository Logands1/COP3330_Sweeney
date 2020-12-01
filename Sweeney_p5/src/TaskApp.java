import java.io.IOException;
import java.util.Scanner;

public class TaskApp {

    public void TaskAppMenu(int input) throws IOException {
        TaskList taskList = new TaskList();
        Scanner scan = new Scanner(System.in);
       // Menus.printNewTaskSelectionMenu();
        while(input != 3){
           // input = scan.nextInt();
            switch (input){
                case 1:
                    Menus.printNewTaskListMenu();
                    taskList.viewList(scan.nextInt());
                    input = scan.nextInt();
                    break;
                case 2:
                    taskList.loadTaskList();
                    Menus.printNewTaskListMenu();
                    taskList.viewList(scan.nextInt());
                    input = scan.nextInt();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error, Unknown Input!");
            }
        }
        Menus.printMainMenu();
    }

}