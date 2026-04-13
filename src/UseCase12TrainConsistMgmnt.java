import java.util.Vector;

/**
 * =========================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =========================================================
 * * Use Case 12: Thread-Safe Bogie List (Vector)
 * * Description:
 * This class demonstrates a legacy thread-safe approach
 * for maintaining a list of train bogies using Vector.
 * * At this stage, the application:
 * - Stores bogie names in a synchronized List
 * - Demonstrates dynamic growth and capacity handling
 * - Displays the final thread-safe consist
 * * This maps legacy synchronized data handling using Vector.
 * * @author Developer
 * @version 12.0
 */
public class UseCase12TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC12 - Thread-Safe Bogie List (Vector) ");
        System.out.println("==============================================\n");

        // Create a Vector
        // Vector is a legacy collection that is synchronized
        Vector<String> bogieVector = new Vector<>();

        // 1. Adding bogies to the thread-safe list
        bogieVector.add("Bogie_V1");
        bogieVector.add("Bogie_V2");
        bogieVector.add("Bogie_V3");

        System.out.println("Initial Bogie Vector: " + bogieVector);

        // 2. Demonstrating dynamic capacity (Unique to Vector/ArrayList)
        // Vector doubles its size when it runs out of space
        System.out.println("Current Vector Capacity: " + bogieVector.capacity());

        // 3. Removing a bogie
        bogieVector.remove("Bogie_V2");

        // 4. Final Display
        System.out.println("\nUpdated Bogie Vector: " + bogieVector);
        System.out.println("Final Bogie Count : " + bogieVector.size());

        System.out.println("\nUC12 thread-safe vector operations completed...");
    }
}