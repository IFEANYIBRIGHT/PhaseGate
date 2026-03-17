import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertArraysEquals;

public class TestingFunction{

    @Test

    public void testIfItAdds(){

    FunctionOne testing = new FunctionOne();

    int actual = testing.addNumbers(4,5);
    
    int expected  = 9;

    assertEquals(actual,expected);

 
    }



    @Test

    public void secondTesting(){
    
    FunctionOne testing = new FunctionOne();

    int actual = testing.addNumbers(23,5);
    
    int expected  = 28;

    assertEquals(actual,expected);

 
    }



    @Test

    public void testIfItEven(){
    
    FunctionOne isEven = new FunctionOne();

    boolean actual = isEven.evenNumbersMethod(2);

    assertTrue(actual);
    
    }



  @Test

    public void secondTestIfItEven(){
    
    FunctionOne isEven = new FunctionOne();

    boolean actual = isEven.evenNumbersMethod(10);

    assertTrue(actual);
    

}

    @Test

    public void testIfItSquares(){

    FunctionOne squares = new FunctionOne();

    int actual = squares.squaresOfANumber(5);
    
    int expected = 25;

    assertEquals(actual,expected);






    }

    
    @Test

    public void SecondTestIfItSquares(){

    FunctionOne squares = new FunctionOne();

    int actual = squares.squaresOfANumber(4);
    
    int expected = 16;

    assertEquals(actual,expected);


    }



    @Test

    public void testThatItConvertsToFahrenheit(){

    
    FunctionOne celsius = new FunctionOne();

    double actual = celsius.celsiusToFahrenheit(23.4);
    
    double expected = 74.12;

    assertEquals(actual,expected);


        }


     @Test

    public void secondTestThatItConvertsToFahrenheit(){

    
    FunctionOne celsius = new FunctionOne();

    double actual = celsius.celsiusToFahrenheit(65.9);
    
    double expected = 150.62;

    assertEquals(actual,expected);


        }
//
//
//    @Test
//    public void testIfItPrime(){
//
//    FunctionOne prime = new FunctionOne();
//
//    boolean actual = prime.isPrime(5);
//
//    assertTrue(actual);
//
//}
//
    


    @Test

    public void testLargestNumber(){
    
    int numbers [] = {2,3,4}; 

    FunctionOne largest = new FunctionOne();

    int actual =  largest.isLargestFunction(numbers);

    int expected  = 4;

    assertEquals(actual,expected);



    }
  
    @Test

    public void secondTestLargestNumber(){
    
    int numbers [] = {2,3,5}; 

    FunctionOne largest = new FunctionOne();

    int actual =  largest.isLargestFunction(numbers);

    int expected  = 5;

    assertEquals(actual,expected);
}

    @Test

    public void testSimpleInterest(){

    FunctionOne interest = new FunctionOne();

    int actual = interest.ifSimpleInterest(34);

    int expected = 0;

    assertEquals(actual,expected);


    }

 @Test

    public void secondTestSimpleInterest(){

    FunctionOne interest = new FunctionOne();

    int actual = interest.ifSimpleInterest(24);

    int expected = 0;

    assertEquals(actual,expected);



    }

    @Test

    public void testmultiplicationalTable(){

    FunctionOne timesTable = new FunctionOne();

    int actual = timesTable.findMultiplicationTable(5);

    int expected = 25;

    assertEquals(actual,expected);
    
   }


    @Test

    public void SecondtestmultiplicationalTable(){

    FunctionOne timesTable = new FunctionOne();

    int actual = timesTable.findMultiplicationTable(10);

    int expected = 100;

    assertEquals(actual,expected);
    



     }
    @Test

    public void testAreaOfARectangle(){

    FunctionOne rectangle = new FunctionOne();

    int actual = rectangle.findAreaOfRectangle(34,56);

    int expected = 1904;

    assertEquals(actual,expected);

    }

    


     @Test

    public void SecondTestAreaOfARectangle(){

    FunctionOne rectangle = new FunctionOne();

    int actual = rectangle.findAreaOfRectangle(23,6);

    int expected =  138;

    assertEquals(actual,expected);

    }

    @Test

    public void testIfItReverse(){

    FunctionOne reverse = new FunctionOne();

    int actual = reverse.checkIfItReversed(12345);

    int expected = 49;

    assertEquals(actual,expected);


    }




    @Test

    public void SecondTestIfItReverse(){

    int number = 54321;    
        
    FunctionOne reverse = new FunctionOne();

    int actual = reverse.checkIfItReversed(number);

    int expected = 53;
   

    assertEquals(actual,expected);









}



}
