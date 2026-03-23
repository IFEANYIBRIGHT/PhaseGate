import java.util.Scanner;
public class TaskEighteen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    System.out.println(" Enter day number  :");

    int userInput = input.nextInt();
    

     String day = "";
     if(userInput % 7 == 0){
           day = "Monday";

    }
        else if(userInput % 7 == 1){
               day = "Tuesday";
        }
           
        else if(userInput % 7 == 2){
               day = "Wednesday";
        }
               
        else if(userInput % 7 == 3){
               day = "Thursday";
        }
                  
        else if(userInput % 7 == 4){
               day = "Friday";
        }
            
    
        else if(userInput % 7 == 5){
               day = "Saturday";
        }
               
        else if(userInput % 7 == 6){
               day = "Saturday";
        }
                   
        else if(userInput % 7 == 7){
               day = "Sunday";
        }

    System.out.println(day);            
}
    

}
