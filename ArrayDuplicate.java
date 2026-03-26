  public class ArrayDuplicate{


    public static int []getDuplicates(int [] numbers){
    
    int newArray[] = new int [numbers.length];
    
    
    for(int count = 0;count < numbers.length;count++){
    
        for(int index = 0;index < numbers.length;index++){
    

        if(newArray[index] == numbers[index]){
        
            newArray[index] = numbers[index];
        
        }
         
             
     }
    
    }
    
 return newArray ;
 }
   
    
    
    
    
    
    
    
    
    
    
   






























}
