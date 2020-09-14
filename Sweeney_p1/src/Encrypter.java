import java.util.Arrays;

public class Encrypter {

    public void encrypt(String number) {
       stringConvert(number);


    }

    //Prints the Array
    public void printArr(int[] numbersArr) {
        String intString = Arrays.toString(numbersArr);

        //Sorry ahead of time for this monstrosity
        intString = intString.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        System.out.println(intString);
        /*for(i = 0; i < numbersArr.length; i++){
            System.out.print(numbersArr[i]);
        }*/
    }

    //Converts the String into an int array
    public void stringConvert(String number) {
        int i;

        char[] numArr = number.toCharArray();
        int[] intNumArr = new int[numArr.length];
        for (i = 0; i < numArr.length; i++) {
            intNumArr[i] = (int) numArr[i] - 48;
        }

        for (i = 0; i < intNumArr.length; i++) {
            intNumArr[i] = (intNumArr[i] + 7);
        }
        encryptor(intNumArr);
    }

    //Encrypts the given number
    public void encryptor(int[] numArr){
        int i, temp;

        for(i = 0; i < numArr.length; i++){
            numArr[i] %= 10; //Mods the number by 10
        }

        //Switches the 1st with 3rd and 2nd with 4th
        for(i = 0; i < 2; i++){
            temp = numArr[i];
            numArr[i] = numArr[i+2];
            numArr[i+2] = temp;
        }
        printArr(numArr);
    }
}