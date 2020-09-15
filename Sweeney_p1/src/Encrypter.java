import java.util.Arrays;
import java.util.Scanner;

public class Encrypter {

    public String encrypt(String number) {
        int[] intNumArr = stringConvert(number);
        int[] numArr = encryptor(intNumArr);
        String intString = arrString(numArr);
        return intString;

    }

    //Prints the Array
    public String arrString(int[] numbersArr) {
        String intString = Arrays.toString(numbersArr);

        //Sorry ahead of time for this monstrosity
        intString = intString.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        //System.out.println(intString);
        /*for(i = 0; i < numbersArr.length; i++){
            System.out.print(numbersArr[i]);
        }*/

        return intString;
    }

    //Converts the String into an int array
    public int[] stringConvert(String number) {
        int i;

        char[] numArr = number.toCharArray();
        int[] intNumArr = new int[numArr.length];
        for (i = 0; i < numArr.length; i++) {
            intNumArr[i] = (int) numArr[i] - 48;
        }

        for (i = 0; i < intNumArr.length; i++) {
            intNumArr[i] = (intNumArr[i] + 7);
        }
        //encryptor(intNumArr);
        return intNumArr;
    }

    //Encrypts the given number
    public int[] encryptor(int[] numArr){
        int i, temp;

        for(i = 0; i < numArr.length; i++){
            numArr[i] %= 10; //Mods the number by 10
        }

        //Switch the 1st with 3rd and 2nd with 4th
        for(i = 0; i < 2; i++){
            temp = numArr[i];
            numArr[i] = numArr[i+2];
            numArr[i+2] = temp;
        }
        //String intString = arrString(numArr);

        //System.out.print(intString);
        return numArr;
    }
}
/*
class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Encrypter encryptor = new Encrypter();
        Decrypter decryptor = new Decrypter();
        System.out.println("Encrypt or Decrypt? ");
        Scanner scan = new Scanner(System.in);
        String selection = scan.next();
        String number;
        if (selection.equals("Encrypt")) {
            System.out.print("Enter in 4 digit number: ");
            number = scan.next();
            encryptor.encrypt(number);
        }

        if (selection.equals("Decrypt")) {
            System.out.print("Enter in 4 digit number: ");
            number = scan.next();
            String num = decryptor.decrypt(number);
            System.out.print(num);
        }

    }
}
*/