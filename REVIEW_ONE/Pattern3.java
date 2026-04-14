package REVIEW_ONE;

/**
 * Pattern3 — Prints a star triangle pattern with row-wise growth.
 * 
 * PATTERN OUTPUT:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * 
 * CONCEPTS:
 * • Nested loops: outer controls rows, inner controls star count
 * • Row i prints i stars
 * • Simple pattern: same string printed in each iteration
 * • Newline after each row for matrix-like display
 * 
 * LEARNING: Star triangle is fundamental for understanding loop patterns.
 */
public class Pattern3 {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: PATTERN PARAMETER ==========
        // n represents the number of rows in the triangle
        int n = 5;
        
        System.out.println("--- Star Triangle Pattern (n=" + n + ") ---\n");
        
        // ========== SECTION 2: OUTER LOOP (ROWS) ==========
        // i represents the current row number (1 to n)
        // Each iteration of the outer loop creates a new row
        for (int i = 1; i <= n; i++) {
            
            // ========== SECTION 3: INNER LOOP (STARS PER ROW) ==========
            // j represents the position within the current row
            // For row i, we print i stars (j = 1 to i)
            for (int j = 1; j <= i; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            
            // ========== SECTION 4: ROW COMPLETION ==========
            // After printing all stars for this row, move to next line
            System.out.println();
        }
        
        // ========== SECTION 5: PATTERN EXPLANATION ==========
        // Row 1: inner loop runs 1 time  -> 1 star
        // Row 2: inner loop runs 2 times -> 2 stars
        // Row 3: inner loop runs 3 times -> 3 stars
        // Row 4: inner loop runs 4 times -> 4 stars
        // Row 5: inner loop runs 5 times -> 5 stars
        
        System.out.println("\nPattern complete.");
    }
}