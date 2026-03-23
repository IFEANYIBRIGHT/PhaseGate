import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
 


public class DayThreeFunctionTesting{

//    @Test
//
//    public void testNumberOfOccurrence(){
//
//    String character = "AaaBBc";
//
//    DayThreeFunction characters = new DayThreeFunction();
//
//    String actual = characters.getNumberOfOccurence(character);
//
//    String expected = "A1a2B2c1";
//
//
//    assertEquals(actual,expected);
//
//
//    }
//


    @Test

    public void getLargestNumber(){

    double [] [] numbers = { 
                    {45.2,90.28,77.1},
                    {3.52,9.86,11.77},
                    {7.7,10,22.33,12},
                    };


    
    DayThreeFunction twoDArrays = new DayThreeFunction();

    double actual  =  twoDArrays.testTheLargest(numbers);

    double expected  = 90.28;

    assertEquals(actual,expected);







    }










    
}

