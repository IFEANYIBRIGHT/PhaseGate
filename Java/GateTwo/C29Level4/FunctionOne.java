public class FunctionOne{


    public static int addNumbers(int firstNumber,int secondNumber){

        return firstNumber + secondNumber;

   }


   public static boolean evenNumbersMethod(int number){

    return number % 2 == 0;

    }



    public static int squaresOfANumber(int number){

    return number * number;

    }



    public static double celsiusToFahrenheit(double number){

    double celsius = (number * 9/5) + 32;

    return celsius;

    }

//
//    public static boolean isPrime(int number){
//
//    while(number > 1){
//    if(number / number == 0 && number / 1 == number) return true; 
//
//    }
//
//    return false;
//
//
//
//
//
//
//    }
//



    public static int isLargestFunction(int []number){

    int largest = 0;

    int secondLargest = 0;

    int thirdLargest = 0;

    for(int count = 0;count < number.length;count++){

    if(number[count] > largest){
        thirdLargest = secondLargest;
        secondLargest = largest;
            largest = number[count];
 

    }else if(number[count] > secondLargest){
             thirdLargest = secondLargest;
            secondLargest = number[count];
 
    }
    
          else if(number[count] > thirdLargest){
             thirdLargest = number[count];
 
    }

    }
        return largest;
  


    }



    public int ifSimpleInterest(int number){

    return number / 100;
      }



    public static int findMultiplicationTable(int number){

    int times = 0;        
    
    for(int count = 0;count <= number;count++){

        for(int index = 0;index <= number; index++){
           times = count *index;
        }

    }
    return times;
 


    }




    public static int findAreaOfRectangle(int length,int width ){

    int area =  length * width;

    return area;
    }

    public static int checkIfItReversed(int number){

    String turnedToString = ""+number;

     int backToNumber  = 0;
    for(int count = turnedToString.length () -1;count >= 0;count --){
    
    char character = turnedToString.charAt(count);

      backToNumber = (int) character;
    


    }

    return backToNumber;



    }







































     
}
