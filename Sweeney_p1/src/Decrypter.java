import java.util.Arrays;

public class Decrypter {

    public void decrypt(String number) {

        stringConvert(number);
    }

    //Prints the Array
    public void printArr(int[] numbersArr) {
        String intString = Arrays.toString(numbersArr);

        //Sorry ahead of time for this monstrosity
        intString = intString.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        System.out.println(intString);
    }

    //Converts the String into an int array
    public void stringConvert(String number){
        int i;

        char[] numArr = number.toCharArray();
        int[] intNumArr = new int[numArr.length];
        for(i = 0; i < numArr.length; i++){
            intNumArr[i] = (int)numArr[i] - 48;
        }
        decryptor(intNumArr);
    }

    //Encrypts the given number
    public void decryptor(int[] numArr){
        int i, temp;

        //Switches the 1st with 3rd and 2nd with 4th
        for(i = 0; i < 2; i++){
            temp = numArr[i];
            numArr[i] = numArr[i+2];
            numArr[i+2] = temp;
        }

        for(i = 0; i < numArr.length; i++){
                numArr[i] += 3;
                numArr[i] %= 10;
        }
        printArr(numArr);
    }
}