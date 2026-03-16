import java.util.Scanner;
public class TasKFifteen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    int largest = 0;
    for(int count = 1;count <= 3; count++){
    System.out.println("Enter number "+(count)+" :");

    int number = input.nextInt();
    
    if(number > largest) largest = number;

    
    } 

  System.out.println(largest +" is the largest number"); 

}

}
