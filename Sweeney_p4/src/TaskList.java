import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskList{
    public ArrayList<TaskItem> taskList;

    public TaskList(){
        taskList = new ArrayList<>();
    }
    public void viewList(int input) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (input != 8) {
            switch (input) {
                case 1:
                    currentTasks();
                    System.out.println(" ");
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 2:
                    addTask();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 3:
                    editTask();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 4:
                    removeTask();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 5:
                    markAsComplete();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 6:
                    markAsIncomplete();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                case 7:
                    saveCurrentList();
                    Menus.printNewListMenu();
                    input = scan.nextInt();
                    break;
                default:
                    System.out.println("ERROR: Unknown input");
            }
        }
        Menus.printMainMenu();
    }


    public void addTask(){
        Scanner scan = new Scanner(System.in);
        String title;
        String description;
        LocalDate dueDate;

        try {
            System.out.print("Add Title: ");
            title = scan.nextLine();
            System.out.print("Add Description: ");
            description = scan.nextLine();
            System.out.print("Add Date (YYYY-MM-DD): ");
            dueDate = LocalDate.parse(scan.nextLine());
            this.taskList.add(new TaskItem(title, description, dueDate));
            System.out.println("\nTask Added!\n");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }

    }

    public void editSpecificTask(TaskItem task){
        Scanner scan = new Scanner(System.in);
        String title;
        String description;
        String dueDate;

        try {
            System.out.print("Edit Title: ");
            title = scan.nextLine();
            if(!(title == null)){
            task.setTitle(title);
            }
            System.out.print("Edit Description: ");
            description = scan.nextLine();
            if(!(description == null)){
                task.setDescription(description);
            }
            System.out.print("Edit Date (YYYY-MM-DD): ");
            dueDate = scan.nextLine();
            if(!(dueDate == null)){
                task.setDueDate(LocalDate.parse(dueDate));
            }

            System.out.println("\nTask Edited!\n");

        }catch (Exception e){
            System.out.print(e.getMessage()+"\n");
        }
    }

    public void currentTasks(){
        int i = 0;
        if (taskList.size() > 0) {
            for (TaskItem task : taskList) {
                System.out.println(i + ") " + (task.isComplete()? "*** " : "" )+ task.getTitle() + " " + task.getDescription() + " " + task.getDueDate());
                i++;
            }
        } else {
            System.out.println(" \nNo Current Tasks\n");
        }

    }

    public void editTask() throws ArrayIndexOutOfBoundsException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Select which Task to edit: \n");

        try{
            currentTasks();
            int edit = scan.nextInt();

            TaskItem task =taskList.get(edit);
            editSpecificTask(task);
       }catch (Exception e){
            System.out.println(e.getMessage());
       }
    }

    public void removeTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select which Task to remove: \n");

        try{
            currentTasks();
            int remove = scan.nextInt();

            TaskItem task = taskList.remove(remove);

            System.out.println("Task Removed!\n");
            return;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void markAsComplete(){
        Scanner scan = new Scanner(System.in);
        try{
            currentTasks();
            int mark = scan.nextInt();

            TaskItem task = taskList.get(mark);
            task.markComplete();
            System.out.println("\nMarked as complete!\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void markAsIncomplete(){
        Scanner scan = new Scanner(System.in);
        try{
            currentTasks();
            int mark = scan.nextInt();

            TaskItem task = taskList.get(mark);
            task.markIncomplete();
            System.out.println("\nMarked as incomplete!\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void saveCurrentList() throws IOException {
        String fileName;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter name of save file: ");
            fileName = scan.nextLine();
            FileOutputStream writeData = new FileOutputStream(fileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(taskList);

            writeStream.close();
            writeData.close();

            System.out.println("\nFile saved!\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void loadTaskList() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String fileName;
        System.out.print("Enter name of file to load: ");
        fileName = scan.nextLine();
        try {
            FileInputStream readData = new FileInputStream(fileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            taskList = (ArrayList<TaskItem>) readStream.readObject();

            readStream.close();
            readData.close();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


