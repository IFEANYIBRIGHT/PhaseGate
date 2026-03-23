import java.util.Scanner;
public class TaskSeventeen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    String password = "admin123";

    System.out.println(" Enter password  :");

    String userInput = input.nextLine();
    
    if(userInput.equals(password)){ 

          System.out.println("Pass word Matches !!"); 
        
    } 

    else{

          System.out.println("Pass word does not match "); 

    }
 

}

}
