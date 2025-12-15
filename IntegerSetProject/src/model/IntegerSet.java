package IntegerSetProject.src.model;

public class IntegerSet {
    private boolean[] set;
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;
    private static final int ARRAY_SIZE = MAX_VALUE + 1;

    // No-argument constructor initializes empty set
    public IntegerSet() {
        set = new boolean[ARRAY_SIZE];
        // All elements are false by default (empty set)
    }

    // Static method to create union of two sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            // Element is true if it's true in either or both sets
            result.set[i] = set1.set[i] || set2.set[i];
        }
        return result;
    }

    // Static method to create intersection of two sets
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            // Element is true only if it's true in both sets
            result.set[i] = set1.set[i] && set2.set[i];
        }
        return result;
    }

    // Insert element k into the set
    public void insertElement(int k) {
        if (k < MIN_VALUE || k > MAX_VALUE) {
            throw new IllegalArgumentException("Integer must be between " + MIN_VALUE + " and " + MAX_VALUE);
        }
        set[k] = true;
    }

    // Delete element m from the set
    public void deleteElement(int m) {
        if (m < MIN_VALUE || m > MAX_VALUE) {
            throw new IllegalArgumentException("Integer must be between " + MIN_VALUE + " and " + MAX_VALUE);
        }
        set[m] = false;
    }

    // Return string representation of the set
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            if (set[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }
        
        return isEmpty ? "---" : sb.toString();
    }

    // Check if two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        if (otherSet == null) {
            return false;
        }
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}

