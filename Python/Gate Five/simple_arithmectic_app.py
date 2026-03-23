#The programs generate numbers  
#
#The random number generator would be controlled by a loop ,at the limit of ten times
#
#the user input the numbers as it appears on the console 
#
#if the user input does not match the correct answer of the subtraction of the random numbers ,the question is asked again and the user has one more attempt to get the same questions 
#
#else the user failed the question 
#
#then the score of the user would be displayed  according to the number of current questions
#


import random

     
correct_answers = 0

second_attempt = 0
     
count = 0
 
correct_answers_counts = 0 
for index in range(10):
    count += 1
    
    first_number = random.randint(1,50)

    second_number = random.randint(1,30)
       
    user_input = int(input(f"{first_number} - {second_number} = "))
    
    correct_answers = first_number - second_number
    
    
    if(correct_answers != user_input):
        print("You have 1 More Attempt on this Particular Question");
        
        print()
        
        user_input = int(input(f"{first_number} - {second_number} = "))
        second_attempt = correct_answers
        
        if(second_attempt > 2):
            print("You have failed that question ❌️")
         
         
    else:
    
        correct_answers_counts += 1
        
        
        
        
print(f"You got {correct_answers_counts}/{count} 🚀️")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
