//The programs generate numbers  
//
//The random number generator would be controlled by a loop ,at the limit of ten times
//
//the user input the numbers as it appears on the console 
//
//if the user input does not match the correct answer of the subtraction of the random numbers ,the question is asked again and the user has one more attempt to get the same questions 
//
//else the user failed the question 
//
//then the score of the user would be displayed  according to the number of current questions
//
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
public class SimpleArithmecticApp{

    public static void main(String...args){
    Scanner input = new Scanner(System.in);

    Random randomNumbers = new Random();

    Date date = new Date();
    
    int corectGuesses = 0;
    
    int scores = 0;
    
    int correct = 0;
    
    int badAnswers = 0;
    
    for(int index = 0;index < 10;index++){
        scores++;
        
    int numbers = randomNumbers.nextInt(50);
    int secondNumber  =  randomNumbers.nextInt(30);
    
     int correctAnswers =  numbers -  secondNumber;
       
    System.out.print(numbers + " - " + secondNumber+ " = ");
    int usersInput  = input.nextInt();
 
     System.out.println();
     
    if(usersInput != correctAnswers){
    
     System.out.println("Failed ❌️");
    
        System.out.println("You Have 1 More Attempt");
    
     System.out.print(numbers + " - " + secondNumber+ " = ");
      usersInput  = input.nextInt();
 
    
        badAnswers = usersInput;
    
        correct++;
    
        
    
        System.out.println();
             
        if(badAnswers > 2){
    
       System.out.println("You Have Used up ur Attempts ");
    
             System.out.println();
        }
     

        }else{
        corectGuesses++;
        
    
        }

    }

    System.out.println("Your Scored "+corectGuesses +"/" + scores+ " Time used is  "+date);



    }
    
    
    
    
    




















}

