import java.util.Scanner;
public class TaskFour{

    public static void main(String...args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int number = input.nextInt();

    int multiply = 0;
    for(int count = 1;count <= number;count++){
       multiply = count  * number;    
                
    

    System.out.printf(" %d X %d = %d %n",number,count,multiply);
}





    }



































}
