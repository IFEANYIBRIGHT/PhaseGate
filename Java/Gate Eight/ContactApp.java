import java.util.Scanner;
import java.util.ArrayList;
public class ContactApp{

    public static void ArrayList <String> getContactNeeds (){
    
    Scanner input = new Scanner(System.in);
    
     ArrayList <String> contactNeeds = new ArrayList<>();
    
    System.out.println("What is ur first name ?");
    
     String userFirstName = input.nextLine();
 
     contactNeeds.add(userFirstName);
    
     System.out.println("What is ur last name ?");
     
      String userLastName = input.nextLine();
     contactNeeds.add(userLastName);
     
     System.out.println("Enter ur phone number ?");
     
     String userPhoneNumber = input.nextLine();
     
       if(userPhoneNumber.matches("\\d{11}")) {
    contactNeeds.add(userPhoneNumber);
} else {
    System.out.println("Invalid phone number");
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    }





















}
