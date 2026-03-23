import java.util.Arrays;

public class ArrayFunction {

    public static int[] allZerosAtTheEnd(int[] numbers) {

        for (int count = 0; count < numbers.length - 1; count++) {

            for (int index = 0; index < numbers.length - 1 - count; index++) {

 
                if (numbers[index] == 0) {

                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
           }
      }
        }

        return numbers;
    }

   




    public static int[] getNegativeNumbers(int[] numbers) {

 
        int count = 0;
        for (int num : numbers) {
            if (num > 0) count++;
        }

 
        int[] negatives = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num > 0) {
                negatives[index++] = num;
            }
        }

        return negatives;
    }































}
