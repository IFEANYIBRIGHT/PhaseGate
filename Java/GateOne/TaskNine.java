import java.util.Scanner;
public class TaskEight{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    System.out.println(" What is the price of the item ? ");

    int itemPrice = input.nextInt();

     double tax =  itemPrice + 0.10;
      
    System.out.println(" The Item u bought is "+tax+" $");




    } 





}
