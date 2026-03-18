package REVIEW_ONE;

public class Triangle {
    public static void main (String args []) {
        int n= 5;

        for ( int i = 1; i <=5; i++){
            for (int j = 1; j <= i; j++){// the value assigned to j will be used in each of the rows
                System.out.print(j + " "); // this is incharge of prining the actual numbers in the row
            }
            System.out.println(); // this is in charge of printing the new line after each row
        }

    };
    
};
// this is a direct repseation of how to use all the nested loopd