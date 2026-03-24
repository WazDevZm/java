package REVIEW_ONE;

public class Triangle1 {
    public static void main(String args[]){
        int n = 1;
        for (int i = 5; i>=n; i--){
            for (int j = i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        // another pattern going here
        for (int i = 6; i >=1; i--){
            for (int j = 1; j>=1;j--){
                System.out.print(j + " ");
            } System.out.println();
        }
    } 
    
}
// this is the pattern that will print out the reversal of the main sequence that was intially made;
