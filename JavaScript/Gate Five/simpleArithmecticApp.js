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





let counter = 0

let correctAnswers = 0

let correct = 0

let lastChance = 0


const prompt = require("prompt-sync")();

    for(let count = 0;count < 10 ;count ++){
    counter ++;
    let randomNumber = Math.floor(Math.random() * (1 , 50 + 1)) + 15;

    let secondNumber =  Math.floor(Math.random() * (1, 30 + 1)) + 23;

    correct = randomNumber - secondNumber
    
       let questions = `${randomNumber} - ${secondNumber}`;
             
        console.log(questions)

        let userInput = parseInt(prompt("  "));
        
        if(userInput !== correct){
        
        console.log("Failed , you have 1 more attempt ");
        
         console.log(questions)
          let userInput = parseInt(prompt("  "));
            lastChance = questions;
        
           if(lastChance > 2){
           
           console.log("Failed , you Failed the question ");
           
           } 
            

        }   else{
        
        correctAnswers ++;
        
        }
}
        console.log("You got "+correctAnswers+"/"+counter);














    
