/**
 * Nested — Demonstrates nested loops to print a descending numeric pattern.
 * 
 * CONCEPTS:
 * • Nested loops: outer loop controls rows, inner loop controls columns
 * • Loop counter manipulation: i decrements in outer, j decrements in inner
 * • Pattern generation using loop structures
 * • System.out.print() vs System.out.println() differences
 * 
 * LEARNING: Control loop flow to create visual output patterns.
 */
public class Nested {

    public static void main(String[] args) {
        
        // ========== SECTION 1: PATTERN SETUP ==========
        // This code prints a descending numeric triangle pattern:
        // 5
        // 4 3
        // 3 2 1
        // 2 1
        // 1
        
        System.out.println("--- Descending Numeric Pattern ---\n");
        
        // ========== SECTION 2: OUTER LOOP (ROWS) ==========
        // i starts at 5 and decreases to 1
        // Each iteration represents a new row
        for (int i = 5; i >= 1; i--) {
            
            // ========== SECTION 3: INNER LOOP (COLUMNS) ==========
            // j starts at current i value and decreases to 1
            // This prints numbers from i down to 1 on the same row
            for (int j = i; j > 0; j--) {
                // Print current number followed by space (no newline)
                System.out.print(j + " ");
            }
            
            // ========== SECTION 4: ROW COMPLETION ==========
            // After inner loop completes, print newline to start new row
            System.out.println();
        }
        
        // ========== SECTION 5: PATTERN SUMMARY ==========
        System.out.println("\nPattern complete.");
    }
}