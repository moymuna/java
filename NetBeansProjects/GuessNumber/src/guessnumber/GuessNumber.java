
package guessnumber;

import java.util.Scanner;


public class GuessNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        int chance = 3;
        boolean flag = false;
        System.out.println("guess a number between 0-9");
        while (chance >= 1) {
            System.out.println("Enter your guess number (" + chance + " chances left): ");
            int guessNumber = input.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println("you win");
                flag = true;
                break;
            } else if (guessNumber > randomNumber) {
                System.out.println("your guess number is larger");
            } else {
                System.out.println("your guess number is smaller");
            }
            chance--;

        }
        if (!flag) {
            System.out.println("Better luck next time!");
        }
        System.out.println("system guess number is " + randomNumber);
        
        
    }
    
}
