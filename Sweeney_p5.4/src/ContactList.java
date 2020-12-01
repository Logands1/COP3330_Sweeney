import java.io.*;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    public ArrayList<ContactItem> contactList;

    public ContactList(){
        contactList = new ArrayList<>();
    }
    Scanner scan = new Scanner(System.in);



    void selectContactList(int input) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (input != 6) {
            switch (input) {
                case 1:
                    currentTasks();
                    System.out.println(" ");
                    Menus.printNewContactListMenu();
                    input = scan.nextInt();
                    break;
                case 2:
                    addTask();
                    Menus.printNewContactListMenu();
                    input = scan.nextInt();
                    break;
                case 3:
                    editTask();
                    Menus.printNewContactListMenu();
                    input = scan.nextInt();
                    break;
                case 4:
                    removeTask();
                    Menus.printNewContactListMenu();
                    input = scan.nextInt();
                    break;
                case 5:
                    saveCurrentList();
                    Menus.printNewContactListMenu();
                    input = scan.nextInt();
                    break;
                default:
                    System.out.println("ERROR: Unknown input");
            }
        }
        Menus.printNewContactSelectionMenu();
    }


    public void addTask(){
        Scanner scan = new Scanner(System.in);
        String fName;
        String lName;
        String pNumber;
        String address;

        try {
            System.out.print("Enter First Name: ");
            fName = scan.nextLine();
            System.out.print("Enter Last Name: ");
            lName = scan.nextLine();
            System.out.print("Enter Phone Number (xxx-xxx-xxxx): ");
            pNumber = scan.nextLine();
            System.out.print("Enter Email Address (x@y.z): ");
            address = scan.nextLine();
            this.contactList.add(new ContactItem(fName, lName, pNumber, address));
            System.out.println("\nContact Added!\n");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }

    }

    public void editSpecificTask(ContactItem task){
        Scanner scan = new Scanner(System.in);
        String fName;
        String lName;
        String pNumber;
        String address;

        try {
            System.out.print("Edit First Name: ");
            fName = scan.nextLine();
            if(!(fName == null)){
                task.setFirstName(fName);
            }
            System.out.print("Edit Last Name: ");
            lName = scan.nextLine();
            if(!(lName == null)){
                task.setLastName(lName);
            }
            System.out.print("Edit Phone Number (xxx-xxx-xxxx): ");
            pNumber= scan.nextLine();
            if(!(pNumber == null)){
                task.setPhoneNumber(pNumber);
            }
            System.out.print("Edit Email Address: ");
            address = scan.nextLine();
            if(!(address == null)){
                task.setEmailAddress(address);
            }

            System.out.println("\nTask Edited!\n");

        }catch (Exception e){
            System.out.print(e.getMessage()+"\n");
        }
    }

    public void currentTasks(){
        int i = 0;
        if (contactList.size() > 0) {
            for (ContactItem task : contactList) {
                System.out.println(i + ") Name: " + task.getFirstName() + " " + task.getLastName() + "\n Phone Number: " + task.getPhoneNumber() + "\n Email Address: " + task.getEmailAddress());
                i++;
            }
        } else {
            System.out.println(" \nNo Current Tasks\n");
        }

    }

    public void editTask() throws ArrayIndexOutOfBoundsException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Select which Contact to edit: \n");

        try{
            currentTasks();
            int edit = scan.nextInt();

            ContactItem task =contactList.get(edit);
            editSpecificTask(task);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void removeTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select which Contact to remove: \n");

        try{
            currentTasks();
            int remove = scan.nextInt();

            ContactItem task = contactList.remove(remove);

            System.out.println("Task Removed!\n");
            return;
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
            FileOutputStream writeData = new FileOutputStream(fileName + "CL.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(contactList);

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
            FileInputStream readData = new FileInputStream(fileName + "CL.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            contactList = (ArrayList<ContactItem>) readStream.readObject();

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
