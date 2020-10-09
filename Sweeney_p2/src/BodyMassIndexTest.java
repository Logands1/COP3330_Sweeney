import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {
    @Test
    public void testBMICategoryOverweight(){
        BodyMassIndex bmi = new BodyMassIndex(72, 190);

        String strAnswer = bmi.category;
        double numAnswer = bmi.bmi;

        assertEquals("Overweight", strAnswer);
        assertEquals(25.765817901234566, numAnswer);
    }

    @Test
    public void testBMICatObese(){
        BodyMassIndex bmi = new BodyMassIndex(72, 300);

        String strAnswer = bmi.category;
        double numAnswer = bmi.bmi();

        assertEquals("Obesity", strAnswer);
        assertEquals(40.682870370370374, numAnswer);
    }

    @Test
    public void testBmiCatNorm(){
        BodyMassIndex bmi = new BodyMassIndex(72, 170);

        String strAnswer = bmi.category;
        double numAnswer = bmi.bmi();

        assertEquals("Normal Weight", strAnswer);
        assertEquals(23.053626543209877, numAnswer);
    }

    @Test
    public void testBmiCatUnder(){
        BodyMassIndex bmi = new BodyMassIndex(72, 100);

        String strAnswer = bmi.category;
        double numAnswer = bmi.bmi();

        assertEquals("Underweight", strAnswer);
        assertEquals(13.560956790123457, numAnswer);
    }

}
