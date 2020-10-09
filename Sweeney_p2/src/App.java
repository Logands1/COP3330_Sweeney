import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    public static boolean moreInput(){
        System.out.print("Enter more values? (Y/N): ");
        Scanner scan = new Scanner(System.in);

        String answer = scan.next();

        return answer.equals("Y") || answer.equals("y");
    }

    public static double getUserHeight(){
        System.out.print("Enter Height in inches: ");
        Scanner scan = new Scanner(System.in);

        double height =scan.nextDouble();

        while(height <= 0){
            System.out.println("Do not enter negative numbers!");
            System.out.print("Enter Height in inches: ");
            height = scan.nextDouble();
        }

        return height;
    }

    public static double getUserWeight(){
        System.out.print("Enter Weight in pounds: ");
        Scanner scan = new Scanner(System.in);

        double weight = scan.nextDouble();

        while(weight <= 0){
            System.out.println("Do not enter negative numbers!");
            System.out.print("Enter Weight in pounds: ");
            weight = scan.nextDouble();
        }

        return weight;
    }

    public static void displayBmiInfo(BodyMassIndex bmi){
        DecimalFormat smallBMI = new DecimalFormat("#.0");
        System.out.println("Your BMI is: " + smallBMI.format(bmi.bmi));
        System.out.println(bmi.category);

    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double average = 0;
        for (int i = 0; i < bmiData.size(); i++) {
            average += bmiData.get(i).bmi();
        }
        if (average == 0) {
            System.out.println(" ");
        }
        else {
            DecimalFormat deciAverage = new DecimalFormat("#.0");
            average = average / bmiData.size();
            System.out.println("Average BMI is: " + deciAverage.format(average));
        }
    }
}
