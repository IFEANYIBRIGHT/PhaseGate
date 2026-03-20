public class ArrayPalindrome {
    public static boolean checkIfPlaindrome (int [] numbers) {
  
        String digits = "";
        for (int count = 0; count < numbers.length; count++) {
            digits += numbers[count];   
        }

 
        String reversed = "";
        for (int count = digits.length() - 1; count >= 0; count--) {
            char reverseChar = digits.charAt(count);
            reversed += reverseChar;
        }

 
        if (digits.equals(reversed)) {
            return true;
     }
   return false;
    }
}
