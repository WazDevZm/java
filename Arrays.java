/**
 * Arrays — Demonstrates 2D array initialization and nested loop traversal.
 * 
 * CONCEPTS:
 * • 2D arrays are arrays of arrays (matrix structure)
 * • Declaration: int[][] marks = new int[][]{ ... }
 * • Access via marks[row][i] where row and i are indices
 * • Nested loops traverse rows, then columns within each row
 * • Loop bounds: outer loop for rows, inner loop for columns
 * 
 * LEARNING: Understand matrix data structures and 2D array iteration.
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        // ========== SECTION 1: 2D ARRAY INITIALIZATION ==========
        // Create a 3x3 integer matrix with inline initialization
        // Structure:
        //   Row 0: {24, 13, 67}
        //   Row 1: {72, 14, 21}
        //   Row 2: {83, 94, 72}
        int[][] marks = new int[][]{
            {24, 13, 67},
            {72, 14, 21},
            {83, 94, 72}
        };
        
        // ========== SECTION 2: CALCULATE DIMENSIONS ==========
        // marks.length gives the number of rows
        int numRows = marks.length;      // 3
        int numCols = marks[0].length;   // 3 (assuming all rows have same length)
        System.out.println("Matrix dimensions: " + numRows + " x " + numCols);
        
        // ========== SECTION 3: NESTED LOOP TRAVERSAL ==========
        // Outer loop: iterate through each row (i = 0 to 2)
        for (int i = 0; i < marks.length; i++) {
            
            // Inner loop: iterate through each column in current row (j = 0 to 2)
            for (int j = 0; j < marks[i].length; j++) {
                // Print each element with formatting
                System.out.print(marks[i][j] + " ");
            }
            
            // After each row, print newline for matrix-like display
            System.out.println();
        }
        
        // ========== SECTION 4: FORMATTED MATRIX OUTPUT ==========
        System.out.println("\n--- Formatted Matrix Display ---");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf("%5d", marks[i][j]);  // Right-aligned, 5 chars wide
            }
            System.out.println();
        }
    }
}
    
    

