public class DayThreeFunction{

    public static double testTheLargest(double[][] numbers){
     
        double largest = 0;           

    for(int outerArray = 0;outerArray < numbers.length;outerArray++){
        for(int innerArray = 0;innerArray < numbers.length;innerArray++){
    
        if(numbers[outerArray][innerArray] > largest){
             largest = numbers[outerArray][innerArray];
        }
       
        }
    
     
        }
return largest;
    }




//     
//
//    public static String getNumberOfOccurence(String character){
//
//    int counter = 0;
//    for(int count = 0;count < character.length();count++){
//
//        
//    char letters =  character.charAt(count);
//
//    if(letters <= 'A' || letters >= 'Z' &  letters <= 'a'  || letters >= 'z' ){
//
//    counter ++;
//
//
//    System.out.println(letters +"" +counter);
//    }
//        
//
//
//
//
//
//
//    }
//
//



//    }

    }

















 
