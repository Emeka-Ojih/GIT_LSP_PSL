// Chukwuemeka Ojih

package org.howard.edu.lsp.midterm.question2;
/**
 * Tests the IntegerRange class.
 */

public class RangeTester {
    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);
        IntegerRange range3 = new IntegerRange(6, 15);

        // Test contains
        System.out.println("Range1 contains 3: " + range1.contains(3)); // Should be true
        System.out.println("Range2 contains 1: " + range2.contains(1)); // Should be false

        // Test overlaps
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2)); // Should be true
        System.out.println("Range2 overlaps Range3: " + range2.overlaps(range3)); // Should be true
        System.out.println("Range1 overlaps Range3: " + range1.overlaps(range3)); // Should be false

        // Test size
        System.out.println("Size of Range1: " + range1.size()); // Should be 5
        System.out.println("Size of Range3: " + range3.size()); // Should be 10

        // Test equals
        IntegerRange range4 = new IntegerRange(1, 5);
        System.out.println("Range1 equals Range4: " + range1.equals(range4)); // Should be true
        System.out.println("Range1 equals Range2: " + range1.equals(range2)); // Should be false
    }
}
