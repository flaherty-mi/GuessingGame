// Meghan Flaherty
// guessing game
// guessing game that prompts the user to guess a randomized number between 1 and 100
// when they decide to stop playing, stats will be displayed based on their gameplay

import java.util.Scanner;
import java.util.Random;

public class MFGuess {

      //static int gamecount;
      //int bestguess = 10000;

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
         // variables
         int gamecount = 0;
         int bestguess = 10000;
         int numguess = 0;
         int sum = 0;
         int play = 1;
         int answer;
         
         //String yes = new String("yes");
         //String no = new String("no");
         
         // display instructions
         instructions();
          // prompting to play game
            System.out.println("do you want to play?");
            System.out.println("type 1 for yes, 2 for no");
               play = input.nextInt();
              // if (play == 1) {
               
                   while (play == 1 ) {
                        numguess = Game();
                        sum += numguess;
                        gamecount++;
                        if (bestguess > numguess) {
                           bestguess = numguess;
                        } // end of if
                     // prompting to play again
                     System.out.println("would you like to play again? yes/no"); 
                     play = input.nextInt();

                   } 
                  // call results method
                  results(sum,  gamecount, bestguess); 
               
              } // end of main method
            
                  // results method
                  public static void results(int sum, int gamecount, int bestguess) {
                     
                     // printing total stats
                        System.out.println("your results are:");
                        System.out.println("games played: " + gamecount);
                        System.out.println("number of guesses: " + sum);
                        System.out.println("average: " + (double) (sum / gamecount));
                        System.out.println("best game: " + bestguess);
                  }
     
            // instructions method
            public static void instructions() {
               System.out.println("How to play:");
               System.out.println("I am thinking of a number between 1 and 100");
               System.out.println("try to guess the number in the least amount of tries to get the best score");
            }
     
     
          // game method      
          public static int Game() {
             
            int numguess = 0;
            int guess = 0;
            Scanner put = new Scanner(System.in);
            Random randomNum = new Random();
             // get random number
             int answer = randomNum.nextInt(100) + 1;
             
                System.out.println("please input your guess:");
                guess = put.nextInt();
                while(answer != guess) {
                  if (guess < answer) {
                    System.out.println("go higher");
                     numguess++;
                    } // end of if
                  else if (guess > answer) {
                    System.out.println("go lower");
                     numguess++;
                    } // end of else if
   
                  guess = put.nextInt();
                 } // end of while loop
                     return numguess;              
             } // end of game method      
          
               
      } // end of class
               
               
         
      

