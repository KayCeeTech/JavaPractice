package tdd;
  import org.junit.jupiter.api.Test;
  import  static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test

    public void testThatMyCalculatorIsOn(){
        //Given
        Calculator calculator = new Calculator();

        //Action
        calculator.setIsOff(true);


        //Assertion
        assertTrue(calculator.getIsOff());
    }

    @Test

    public  void testThatMyCalculatorIsOff(){
        // Given
        Calculator calculator = new Calculator();

        //Action
        calculator.setIsOn(false);

        //Assertion
        assertFalse(calculator.getIsOn());
    }


}
