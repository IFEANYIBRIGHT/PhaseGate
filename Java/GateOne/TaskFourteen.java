import java.util.Scanner;
public class TaskFourteen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);

    int largest = 0;
    for(int count = 0;count <= 2; count++){
    System.out.println("Enter number "+(count + 1)+" :");

    int number = input.nextInt();
    
    if(number > largest) largest = number;

    
    } 

  System.out.println(largest +" is the largest number"); 

}

}
