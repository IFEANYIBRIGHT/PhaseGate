import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;


public class FunctionTesting{


    @Test

    public void testArrayFill(){
    
    int [] numbers = {10,11,12} ;

    int length = 5;

     ArrayFunction arrays = new ArrayFunction();

     int actual [] = arrays.testIfItFill(numbers);

     int expected = {10,11,12,-1,-1};

     assertArraysEquals(actual,expected);




    }




    @Test

    public void secondTestArrayFill(){
    
    int [] numbers = {10,11,12,13,14} ;

    int length = 2;

     ArrayFunction arrays = new ArrayFunction();

     int actual [] = arrays.testIfItFill(numbers);

     int expected = {10,11};

     assertArraysEquals(actual,expected);




    }



    
    @Test

    public void thirdTestArrayFill(){
    
    int [] numbers = {} ;

    int length = 4;

     ArrayFunction arrays = new ArrayFunction();

     int actual [] = arrays.testIfItFill(numbers);

     int expected = {-1,-1,-1.-1};

     assertArraysEquals(actual,expected);




    }























}
