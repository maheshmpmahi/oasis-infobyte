import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args){
        Random rand=new Random();
        Scanner scanner=new Scanner(System.in);
        int randomNumber=rand.nextInt(100)+1;
        System.out.println("Welcome to number guessing game!");
        while(true){
            System.out.println("Enter your guess (1-100):");
            int playerGuess=scanner.nextInt();
        
            if(playerGuess==randomNumber){
                System.out.println("genius! you guessed the correct number");
                break;
            }
            else if(randomNumber>playerGuess){
                System.out.println("nope! The number is higher.Guess again.");
            }
            else{
                System.out.println("nope! The number is lower.Guess again.");
            }
        }
    }
}
