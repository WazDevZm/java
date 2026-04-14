package REVIEW_ONE;

/**
 * Triangle — Prints a numeric triangle where each row shows 1 through row number.
 * 
 * PATTERN OUTPUT:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * CONCEPTS:
 * • Nested loops: outer controls rows, inner controls numbers per row
 * • Inner loop counter j resets each row (1 to i)
 * • Each row displays: 1, 2, 3, ..., i
 * • Different from Pattern2: counter resets each row, not persistent
 * 
 * LEARNING: Contrast with Pattern2 to understand counter scope/persistence.
 */
public class Triangle {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: PATTERN PARAMETER ==========
        // n represents the number of rows to print
        int n = 5;
        
        System.out.println("--- Numeric Triangle Pattern (n=" + n + ") ---\n");
        
        // ========== SECTION 2: OUTER LOOP (ROWS) ==========
        // i represents the current row number (1 to n)
        // Also determines how many numbers to print in that row
        for (int i = 1; i <= 5; i++) {
            
            // ========== SECTION 3: INNER LOOP (NUMBERS PER ROW) ==========
            // j represents the number to print (1 to i)
            // IMPORTANT: j resets to 1 at the start of each row
            // This is different from Pattern2 where counter persists
            for (int j = 1; j <= i; j++) {
                // Print current number and space
                System.out.print(j + " ");
            }
            
            // ========== SECTION 4: ROW COMPLETION ==========
            // After printing all numbers for this row, move to next line
            System.out.println();
        }
        
        // ========== SECTION 5: PATTERN EXPLANATION ==========
        // Row 1: j goes 1 to 1       -> prints 1
        // Row 2: j goes 1 to 2       -> prints 1 2
        // Row 3: j goes 1 to 3       -> prints 1 2 3
        // Row 4: j goes 1 to 4       -> prints 1 2 3 4
        // Row 5: j goes 1 to 5       -> prints 1 2 3 4 5
        
        // ========== SECTION 6: COMPARISON WITH PATTERN2 ==========
        // Pattern2 uses persistent counter 'num' (1, 2, 3, 4, 5, 6, ...)
        // Triangle resets inner counter j each row (always 1 to i)
        
        System.out.println("\nPattern complete.");
    }
}