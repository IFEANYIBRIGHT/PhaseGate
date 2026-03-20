import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFunctionTesting{

    @Test
 
    public void arrayNegativeNumbers(){

        int numbers[] = {5,-9,3,-6,2,-11};

        NegativeNumbers negativeNumbers = new NegativeNumbers();

        int actual [] = negativeNumbers.getNegativeNumbers(numbers);

        
        int expected[] = {5,3,2};

        assertArrayEquals(actual,expected);





 }


   @Test

    public void testIfAllZerosAreAtTheBack(){

    int [] numbers =  {5, 0, 3, 0, 2, 0};

     ArrayFunction swappedNumbers = new ArrayFunction();

    int actual [] = swappedNumbers.allZerosAtTheEnd(numbers);

    int expected [] = {5,3,2,0,0,0};

    assertArrayEquals(actual,expected);








    }




























}
