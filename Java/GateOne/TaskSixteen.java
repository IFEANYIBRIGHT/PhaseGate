import java.util.Scanner;
public class TaskSixteen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    System.out.println(" Enter Year to check if it is a leap year :");

    int number = input.nextInt();
    
    if(number >  365){ 

          System.out.println("It is a leap year"); 
        
    } 

    else{

          System.out.println("It is not a leap year"); 

    }
 

}

}
