// remember that all importations must be placed outside all the classes and they are delcared in the first section of the progra,
import java.util.Scanner;;
public class Program_1 {
    // this java program will help you add two matrices
    public static void main(String[] args) {
        // Create a new scanner object that will read user input
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number of rows and columns for the matrices
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt()
        System.out.println("Enter the number of columns:");

        int cols = input.nextInt();
        // Create two 2d arryas that eill gold the inputs of the user

        int first [] [] = new int [rows][cols];
        int second [] [] = new int [rows][cols];

        // create a 2d array that will hold the result of the addition

        int sum [] [ ] = new int [rows][cols];
        // prompt the user to enter the elements of the first matrix
        System.out.println("Enter the elements of the first matrix");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                first [i] [j] = input.nextInt();
            }
        }
        // Prompt the user to enter the elements of the second matrix.
        System.out.println("Enter the elements of the second matrix");

        for (int i = 0; i < rows; i ++) {
            for ( int j = 0; j < cols; j ++ ){
                second [i] [j] = input.nextInt()
            }
        
        // Add the two matrices and store the result in the sum matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum [i] [j] = first [i] [j] + second [i] [j];
            }
        }
      // print the result of the addition
      System.out.println("The sum of the two matrices is:");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(sum [i] [j] + " ");
// after printing each row, print a new line
        }
        System.out.println();
      }
      // close the scanner object to prevent memory leaks
      input.close(); // this is good practice to prevent any memory leaks....
    }

}
