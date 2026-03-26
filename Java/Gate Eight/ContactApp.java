import java.util.Scanner;
import java.util.ArrayList;
public class ContactApp{

    public static void getContactNeeds (ArrayList <String> firstName,ArrayList <String> lastName,ArrayList <String> phoneNumber){
    
    Scanner input = new Scanner(System.in);
    System.out.println("What is ur first name ?");
    
     String userFirstName = input.nextLine().toLowerCase();
 
     firstName.add(userFirstName);
    
     System.out.println("What is ur last name ?");
     
      String userLastName = input.nextLine().toLowerCase();
     lastName.add(userLastName);
     
     System.out.println("Enter ur phone number ?");
     
     String userPhoneNumber = input.nextLine();
     
        if(userPhoneNumber.length() <= 11 && userPhoneNumber.length() =< 11){
             phoneNumber.add(userPhoneNumber);
        }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    }





















}
