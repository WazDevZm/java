public class Tenary {
    public static void main(String[] args) {
        int time = 20;
       

        // Using ternary operator to find the maximum of two numbers
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        //implementing the same logic using if-else statement
        //remember that the data type of the variable result must be the same as the data type of the value being assigned to it
    }
}