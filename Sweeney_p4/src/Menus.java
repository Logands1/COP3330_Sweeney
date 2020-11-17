import java.util.Scanner;

public class Menus {

    public static void printMainMenu(){
        System.out.println("Main Menu");
        System.out.println("-----------");
        System.out.println("");
        System.out.println("1) Create a new list");
        System.out.println("2) Load existing list");
        System.out.println("3) Exit");
        System.out.println("");
        System.out.print("> ");
    }

    public static void printNewListMenu(){
        System.out.println("List Operation Menu");
        System.out.println("-----------");
        System.out.println("");
        System.out.println("1) View the list");
        System.out.println("2) Add an item");
        System.out.println("3) Edit an item");
        System.out.println("4) Remove an item");
        System.out.println("5) Mark an item as complete");
        System.out.println("6) Unmark an item as complete");
        System.out.println("7) Save the current list");
        System.out.println("8) Go back to Main Menu");
        System.out.println("");
        System.out.print("> ");
    }

}
