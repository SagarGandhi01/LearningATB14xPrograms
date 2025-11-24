package Loop_Practice;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main() {

        Random random = new Random();
        int GuessToNumber = random.nextInt(100);
        System.out.println(GuessToNumber);
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;

        while (true)
        {
            if(!scanner.hasNextInt())
            {
                System.out.println("Enter Proper int Number");
                scanner.nextInt();
                continue;
            }

            int guess = scanner.nextInt();
            attempt++;

            if(guess < 0 || guess > 100)
            {
                System.out.println("Guess Number must be between 1 to 100");
                continue;
            }
            if( guess > GuessToNumber)
            {
                System.out.println("Too High, Try again");
            }
            else if (guess < GuessToNumber)
            {
                System.out.println("Too Low, Try Again");
            }
            else {
                System.out.println("Matched");
                System.out.println(attempt);
                break;
            }

        }
    }
}
