public class BodyMassIndex {

    double bmi;
    String category = null;


    public BodyMassIndex(double height, double weight) {
        bmi = (703 * weight)/(height*height);
        category = bmiCategories(bmi);
        double BMI = bmi;
    }


    public String bmiCategories(double BMI){
        if(BMI < 18.5){
            category = "Underweight";
        }
        if(BMI >= 18.5 && BMI < 24.94){
            category = "Normal Weight";
        }
        if(BMI >= 24.95 && BMI <29.94){
            category = "Overweight";
        }
        if(BMI >= 29.95){
            category = "Obesity";
        }
        return category;
    }

    public double bmi(){
        return bmi;
    }
}
