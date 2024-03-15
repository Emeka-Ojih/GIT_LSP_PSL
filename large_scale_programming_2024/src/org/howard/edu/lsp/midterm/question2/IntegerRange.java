// Chukwuemeka Ojih

package org.howard.edu.lsp.midterm.question2;

/**
 * Represents an integer range with a lower and upper bound.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with specified lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if a given value is within the range.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= this.lowerBound && value <= this.upperBound;
    }

    /**
     * Checks if there is any overlap between this range and another range.
     *
     * @param other the other range to check against
     * @return true if there is an overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
        }
        return false;
    }

    /**
     * Calculates the size of the range.
     *
     * @return the size of the range
     */
    @Override
    public int size() {
        return this.upperBound - this.lowerBound + 1;
    }

    /**
     * Compares this range with another object for equality.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }
}
