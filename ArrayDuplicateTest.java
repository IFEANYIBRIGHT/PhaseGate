import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


    public class ArrayDuplicateTest{

    @Test

    public void duplicates(){
    
    
    int [] array = {9,2,3,2,1};
    
    ArrayDuplicate numbers = new ArrayDuplicate();
    
    int []actual = numbers.getDuplicates(array);
    
    
    int [] expected  = {9,3,1};
    
      
    assertArrayEquals(actual,expected);
    
    
    
    
    
    
    
    }


























}
