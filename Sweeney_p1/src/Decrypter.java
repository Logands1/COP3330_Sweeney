import java.util.Arrays;

public class Decrypter {

    public String decrypt(String number) {

        int[] intNumArr = stringConvert(number);
        int[] numArr = decryptor(intNumArr);
        String intString = printArr(numArr);
        return intString;
    }

    //Prints the Array
    public String printArr(int[] numbersArr) {
        String intString = Arrays.toString(numbersArr);

        //Sorry ahead of time for this monstrosity
        intString = intString.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        //System.out.println(intString);

        return intString;
    }

    //Converts the String into an int array
    public int[] stringConvert(String number){
        int i;

        char[] numArr = number.toCharArray();
        int[] intNumArr = new int[numArr.length];
        for(i = 0; i < numArr.length; i++){
            intNumArr[i] = (int)numArr[i] - 48;
        }
        //decryptor(intNumArr);

        return intNumArr;
    }

    //Decrypts the given number
    public int[] decryptor(int[] numArr){
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
        //String intString = printArr(numArr);

        //System.out.print(intString);
        return numArr;
    }
}