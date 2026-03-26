import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ContactAppTest{

    @Test 
    
    public void testAddContact(){
    
    ArrayList <String> addContact = new  ArrayList<>();
    
    ContactApp contact = new ContactApp();
    
     ArrayList <String> phoneNumber = "08131913381"; 
        
    ArrayList <String>  actual = contact.getContactNeeds("John","doe",phoneNumber);
    
    assertTrue(actual);
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    



























}
