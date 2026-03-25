package ARRAYS;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main (String args) {



        int [] myNumbers = new int [5];

        try (// we ask the use to enter the numbers in the Array
        Scanner input = new Scanner(System.in)) {
            // the first number being enterred here
            System.out.println("Enter the first number: ");
            myNumbers[0] = input.nextInt();
            // the second number being enterred here
            System.out.println("Enter the second number: ");
            myNumbers[1] = input.nextInt();
            // the third number being enterred here


            System.out.println("Enter the third number: ");
            myNumbers[2] = input.nextInt();
            // the fourth number being enterred here

    // print out the numbers that have been entereted o far
            System.out.println("The numbers you have entered are: " + myNumbers[0] + ", " + myNumbers[1] + ", " + myNumbers[2]);

            // the fourth number being enterred here
            System.out.println("Enter the fourth number: ");
            myNumbers[3] = input.nextInt();
            // the fifth number being enterred here
            System.out.println("Enter the fifth number: ");
            myNumbers[4] = input.nextInt();
        }

        // print out the numbers that have been entereted so far
        System.out.printf("%s%n%s%n", "The numbers you have entered are: " + myNumbers[0] + ", " + myNumbers[1] + ", " + myNumbers[2] + ", " + myNumbers[3] + ", " + myNumbers[4]);

    }
}
