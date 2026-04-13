import java.util.Hashtable;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * =========================================================
 * * Use Case 10: Thread-Safe Bogie Registry (Hashtable)
 * * Description:
 * This class demonstrates a thread-safe approach to managing
 * the bogie registry using Hashtable for synchronized access.
 * * At this stage, the application:
 * - Stores bogie assignments in a synchronized Map
 * - Handles data securely for multi-user scenarios
 * - Displays the final secure registry
 * * This maps thread-safe data handling using Hashtable.
 * * @author Developer
 * @version 10.0
 */
public class UseCase10TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC10 - Thread-Safe Bogie Registry (Hashtable) ");
        System.out.println("==============================================\n");

        // Create a Hashtable
        // Hashtable is synchronized, meaning it is thread-safe
        Map<String, String> bogieRegistry = new Hashtable<>();

        // 1. Securely adding bogie assignments
        bogieRegistry.put("Bogie_101", "Assigned to Engine_A");
        bogieRegistry.put("Bogie_102", "Assigned to Engine_A");
        bogieRegistry.put("Bogie_103", "In Maintenance");
        bogieRegistry.put("Bogie_104", "Available");

        // 2. Display the registry status
        System.out.println("Secure Bogie Registry Status:");
        for (String key : bogieRegistry.keySet()) {
            System.out.println("Bogie ID: " + key + " -> Status: " + bogieRegistry.get(key));
        }

        System.out.println("\nNote:");
        System.out.println("Hashtable ensures that data remains consistent during concurrent updates.");

        System.out.println("\nUC10 thread-safe registry completed...");
    }
}