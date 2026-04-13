import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase14TrainConsistMgmnt
 * =========================================================
 * * Use Case 14: Performance Analysis (ArrayList vs LinkedList)
 * * Description:
 * This class compares the execution time of ArrayList and
 * LinkedList for basic train consist operations.
 * * At this stage, the application:
 * - Measures time taken to add bogies to both lists
 * - Demonstrates the structural difference in data handling
 * - Helps developers choose the right collection based on speed
 * * This maps performance benchmarking of Java Collections.
 * * @author Developer
 * @version 14.0
 */
public class UseCase14TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC14 - Performance: ArrayList vs LinkedList ");
        System.out.println("==============================================\n");

        int iterations = 100000; // Testing with 100k operations

        // 1. Performance Test for ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Add Time  : " + (endTime - startTime) + " ns");

        // 2. Performance Test for LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Add Time : " + (endTime - startTime) + " ns");

        System.out.println("\nComparison Insight:");
        System.out.println("- ArrayList is generally faster for adding to the end and random access.");
        System.out.println("- LinkedList is superior for frequent insertions/removals at the start.");

        System.out.println("\nUC14 performance analysis completed...");
    }
}