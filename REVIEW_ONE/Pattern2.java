package REVIEW_ONE;

/**
 * Pattern2 — Prints a number triangle where each row contains consecutive integers.
 * 
 * PATTERN OUTPUT:
 * 1
 * 2 3
 * 4 5 6
 * 5 6 7 8
 * 6 7 8 9 10
 * 
 * CONCEPTS:
 * • Nested loops: outer controls rows, inner controls columns
 * • Persistent counter: 'num' maintains state across row iterations
 * • Incrementing counter: each print increments the counter
 * • Row-wise growth: row i prints i numbers
 * 
 * LEARNING: Use outer and inner loop counters for complex patterns.
 */
public class Pattern2 {

    public static void main(String[] args) {
        
        // ========== SECTION 1: PATTERN PARAMETERS ==========
        // n represents the number of rows to print
        int n = 5;
        
        // ========== SECTION 2: PERSISTENT COUNTER ==========
        // 'num' starts at 1 and persists across all iterations
        // It increments every time we print, creating continuous sequence
        int num = 1;
        
        // ========== SECTION 3: OUTER LOOP (ROWS) ==========
        // i represents the current row number (1 to n)
        // Row 1 prints 1 number, row 2 prints 2 numbers, etc.
        for (int i = 1; i <= n; i++) {
            
            // ========== SECTION 4: INNER LOOP (COLUMNS) ==========
            // j represents the column position within current row
            // For row i, we print i numbers (j = 1 to i)
            for (int j = 1; j <= i; j++) {
                // Print current number and increment
                System.out.print(num + " ");
                num++;  // This is crucial: counter persists and increases
            }
            
            // ========== SECTION 5: ROW COMPLETION ==========
            // After completing each row, print newline
            System.out.println();
        }
        
        // ========== SECTION 6: FINAL STATE ==========
        System.out.println("\nPattern complete. Final counter value: " + num);
    }
}