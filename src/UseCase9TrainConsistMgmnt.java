import java.util.Map;
import java.util.TreeMap;

/**
 * =========================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * =========================================================
 * * Use Case 9: Sorted Bogie Inventory (TreeMap)
 * * Description:
 * This class ensures that the bogie inventory is always
 * maintained in a sorted order based on Bogie IDs.
 * * At this stage, the application:
 * - Maps Bogie IDs to their types
 * - Automatically sorts entries by ID
 * - Displays the sorted inventory list
 * * This maps sorted data association using TreeMap.
 * * @author Developer
 * @version 9.0
 */
public class UseCase9TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC9 - Sorted Bogie Inventory (TreeMap) ");
        System.out.println("==============================================\n");

        // Create a TreeMap
        // TreeMap automatically sorts keys in natural (ascending) order
        Map<String, String> bogieInventory = new TreeMap<>();

        // 1. Adding Bogie IDs and their types (in random order)
        bogieInventory.put("BG104", "Sleeper");
        bogieInventory.put("BG101", "Engine");
        bogieInventory.put("BG103", "AC Chair Car");
        bogieInventory.put("BG102", "Pantry Car");

        // 2. Display the sorted inventory
        // Even though we added BG104 first, BG101 will appear first in output
        System.out.println("Sorted Bogie Inventory (By ID):");
        for (Map.Entry<String, String> entry : bogieInventory.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Type: " + entry.getValue());
        }

        System.out.println("\nNote:");
        System.out.println("TreeMap automatically maintains the keys in ascending order.");

        System.out.println("\nUC9 sorted inventory management completed...");
    }
}