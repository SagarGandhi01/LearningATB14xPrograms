package Loop_Practice;

import java.util.Scanner;

public class Factorial {
    public static void main() {

        System.out.println("Enter Number:");
        Scanner scanner = new Scanner(System.in);
        int fact = 1;

        if(!scanner.hasNextInt())
        {
            System.out.println("Please, Enter valid Integer Number");
        }
        else {
            int input = scanner.nextInt();

            if (input < 0 || input > Integer.MAX_VALUE)
            {
                System.out.println("Enter valid Number");
            }

            if (input == 0 )
            {
                fact = 1;
            }

            for (int i =1 ; i <= input ; i++)
            {
                fact = fact * i;
            }
            System.out.printf("Factorial of %d is %d",input, fact);
        }

    }
}
