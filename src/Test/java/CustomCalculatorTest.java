import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {


        @Test
        public void AddTest(){
            CustomCalculator customCalculator = new CustomCalculator() ;
            int result = customCalculator.add(3,4);
            assertTrue(result==7);
        }
        @Test
        public void MinusTest(){
            CustomCalculator customCalculator = new CustomCalculator();
            int result = customCalculator.subtract(10,2);
            assertTrue(result ==8);
        }
        @Test
        public void MultipleTest(){
            CustomCalculator customCalculator = new CustomCalculator();
            int result = customCalculator.multiply(10,2);
            assertTrue(result ==8);
        }
}