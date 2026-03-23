import java.util.Scanner;
public class TaskTen{

   public static void main(String...args){
    Scanner input = new Scanner(System.in);


     int sum  = 0;
    for(int count = 1;count <= 3;count++){
    System.out.println("Enter number "+ (count)+ ":");

     int number = input.nextInt();

       sum +=  number ;
}      
    double average = sum / 3;
    System.out.println(" The average of three numbers are  "+average);




    } 





}
