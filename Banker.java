import java.util.Scanner;
public class Banker {
    public void static main (string [] args) {
        System.out.println("Welcome to the Bank!"); // console applaiction
        // Declare some variables here
         double balance;
         boolean isRunning = true;
         int choice;

        // this will giv out some data to the use 
        System.out.println("********************************");
        System.out.println("Banking Project");
        System.out.println("1. Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("*********************************")
        // Create a new Scanner ojedt that will read inpur from the user
         Scanner input = new Scanner.(System.in);

         choice = input.nextInt();

         // createing a switch statement to handle the user input
         switch (choice) { // this is an enhanced switch
            case 1 -> System.out.println("SHOW BALANCE");
            case 2 -> System.out.println("DEPOSIT");
            case 3 -> System.out.println("WITHDRAW");
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
            // we are placing all the choicec in this case using ->
            
         }
   
    
         
         

    

        // Display Menu










        // 
    }   
    
}
