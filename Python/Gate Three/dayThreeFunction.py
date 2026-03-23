def get_the_largest(numbers,second_numbers,third_numbers):
    largest = 0
    for outer_loop in range(len(numbers)):
 
            if(numbers[outer_loop] > largest):
                largest = numbers[outer_loop] 
  
    for index in range(len(second_numbers)):     
            if (second_numbers[index] > largest):
                largest = second_numbers[index] 

    
    for count in range(len(third_numbers)):     
            if (third_numbers[count] > largest):
                largest = third_numbers[count] 

    return largest

    
