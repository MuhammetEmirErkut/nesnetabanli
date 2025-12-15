package IntegerSetProject.src.test;

import IntegerSetProject.src.model.IntegerSet;

public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("=== IntegerSet Test Program ===\n");

        // Test 1: Create empty sets
        System.out.println("Test 1: Creating empty sets");
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set1 equals Set2: " + set1.isEqualTo(set2));
        System.out.println();

        // Test 2: Insert elements
        System.out.println("Test 2: Inserting elements into Set1");
        set1.insertElement(5);
        set1.insertElement(10);
        set1.insertElement(15);
        set1.insertElement(20);
        System.out.println("Set1 after inserting 5, 10, 15, 20: " + set1);
        System.out.println();

        // Test 3: Insert elements into second set
        System.out.println("Test 3: Inserting elements into Set2");
        set2.insertElement(10);
        set2.insertElement(15);
        set2.insertElement(25);
        set2.insertElement(30);
        System.out.println("Set2 after inserting 10, 15, 25, 30: " + set2);
        System.out.println();

        // Test 4: Delete element
        System.out.println("Test 4: Deleting element from Set1");
        set1.deleteElement(10);
        System.out.println("Set1 after deleting 10: " + set1);
        System.out.println();

        // Test 5: Union operation
        System.out.println("Test 5: Union of Set1 and Set2");
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println();

        // Test 6: Intersection operation
        System.out.println("Test 6: Intersection of Set1 and Set2");
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println();

        // Test 7: Equality check
        System.out.println("Test 7: Equality check");
        IntegerSet set3 = new IntegerSet();
        set3.insertElement(5);
        set3.insertElement(15);
        set3.insertElement(20);
        System.out.println("Set1: " + set1);
        System.out.println("Set3: " + set3);
        System.out.println("Set1 equals Set3: " + set1.isEqualTo(set3));
        System.out.println();

        // Test 8: Edge cases - boundaries
        System.out.println("Test 8: Testing boundary values (0 and 100)");
        IntegerSet boundarySet = new IntegerSet();
        boundarySet.insertElement(0);
        boundarySet.insertElement(100);
        System.out.println("Boundary set with 0 and 100: " + boundarySet);
        System.out.println();

        // Test 9: Multiple insertions and deletions
        System.out.println("Test 9: Multiple operations");
        IntegerSet complexSet = new IntegerSet();
        complexSet.insertElement(1);
        complexSet.insertElement(2);
        complexSet.insertElement(3);
        System.out.println("After inserting 1, 2, 3: " + complexSet);
        complexSet.deleteElement(2);
        System.out.println("After deleting 2: " + complexSet);
        complexSet.insertElement(4);
        complexSet.insertElement(5);
        System.out.println("After inserting 4, 5: " + complexSet);
        System.out.println();

        // Test 10: Empty set operations
        System.out.println("Test 10: Operations with empty sets");
        IntegerSet empty1 = new IntegerSet();
        IntegerSet empty2 = new IntegerSet();
        IntegerSet emptyUnion = IntegerSet.union(empty1, empty2);
        IntegerSet emptyIntersection = IntegerSet.intersection(empty1, empty2);
        System.out.println("Empty union: " + emptyUnion);
        System.out.println("Empty intersection: " + emptyIntersection);
        System.out.println();

        System.out.println("=== All tests completed ===");
    }
}

