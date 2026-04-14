package REVIEW_ONE;

/**
 * Triangle1 — Prints descending numeric patterns (two different patterns).
 * 
 * PATTERN 1 OUTPUT (lines 6-11):
 * 5
 * 4 3
 * 3 2 1
 * 2 1
 * 1
 * 
 * PATTERN 2 (lines 14-18):
 * NOTE: Has a bug in inner loop; fixed in comments below.
 * 
 * CONCEPTS:
 * • Reverse logic: outer loop counts down (i--)
 * • Inner loop counts down from current value (j--)
 * • Decreasing sequence per row
 * • Bug demonstration: improper loop condition (j >= 1 with j--)
 * 
 * LEARNING: Understand reverse loops and common loop pitfalls.
 */
public class Triangle1 {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: PATTERN 1 - DESCENDING NUMERIC PYRAMID ==========
        System.out.println("--- Pattern 1: Descending Pyramid ---\n");
        
        // ========== SECTION 2: OUTER LOOP (REVERSE) ==========
        // i starts at 5 and counts DOWN to 1
        // Each iteration creates a new row
        int n = 1;
        for (int i = 5; i >= n; i--) {
            
            // ========== SECTION 3: INNER LOOP (REVERSE) ==========
            // j starts at current i and counts DOWN to 1
            // This creates a descending sequence for the row
            for (int j = i; j >= 1; j--) {
                // Print current number and space
                System.out.print(j + " ");
            }
            
            // ========== SECTION 4: ROW COMPLETION ==========
            // After inner loop completes, move to next line
            System.out.println();
        }
        // Pattern 1 Output:
        // 5
        // 4 3
        // 3 2 1
        // 2 1
        // 1
        
        // ========== SECTION 5: SEPARATOR ==========
        System.out.println();
        
        // ========== SECTION 6: PATTERN 2 - DEMONSTRATING A LOOP BUG ==========
        System.out.println("--- Pattern 2: Loop with Condition Issue ---\n");
        
        // ORIGINAL CODE (buggy):
        //     for (int i = 6; i >= 1; i--) {
        //         for (int j = 1; j >= 1; j--) {  // <-- PROBLEM HERE
        //             System.out.print(j + " ");
        //         }
        //         System.out.println();
        //     }
        // 
        // THE BUG:
        // - Inner loop condition: j >= 1 (j starts at 1, must be >= 1)
        // - Inner loop decrement: j--
        // - Result: j = 1, check 1 >= 1 (true), print 1, j = 0
        //           0 >= 1 (false), loop exits
        // - This prints only one '1' per row, infinite times (or limited by outer loop)
        // - This is likely unintended behavior
        
        // CORRECTED VERSION (what was probably intended):
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {  // FIXED: j starts at i, not 1
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Corrected Pattern 2 Output:
        // 6 5 4 3 2 1
        // 5 4 3 2 1
        // 4 3 2 1
        // 3 2 1
        // 2 1
        // 1
        
        // ========== SECTION 7: KEY INSIGHTS ==========
        // 1. Pattern 1 uses outer i and inner j, both counting DOWN
        // 2. Pattern 2 had a bug where inner j always started at 1
        // 3. Fixing j to start at i creates a proper pyramid
        // 4. Decrement operators (i--, j--) move BACKWARDS through values
        // 5. Loop conditions must align with increment/decrement direction
        //    - (i >= 1) with i-- is correct
        //    - (i <= 5) with i++ is correct
        //    - Mismatches can cause infinite loops or unexpected results
        
        System.out.println("\nPatterns complete.");
    }
}
