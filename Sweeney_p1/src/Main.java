import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Encrypter encryptor = new Encrypter();
        Descripter decryptor = new Descripter();

        System.out.println("Encrypt or Decrypt? ");
        Scanner scan = new Scanner(System.in);
        String selection = scan.next();

        if(selection.equals("Encrypt")){
            System.out.print("Enter in 4 digit number: ");
            String number = scan.next();
            encryptor.encrypt(number);
        }
        if(selection.equals("Decrypt")){
            System.out.print("Enter in 4 digit number: ");
            String number = scan.next();
            decryptor.decrypt(number);
        }
    }
}
