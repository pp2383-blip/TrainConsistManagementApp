import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * =========================================================
 * * Use Case 8: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class demonstrates how to associate specific data
 * with a bogie using a Key-Value pair structure.
 * * At this stage, the application:
 * - Maps Bogie names to their respective capacities
 * - Retrieves capacity for a specific bogie
 * - Displays the entire capacity mapping
 * * This maps data association using HashMap.
 * * @author Developer
 * @version 8.0
 */
public class UseCase8TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC8 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        // Create a Map to store Bogie Name (String) and Capacity (Integer)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 1. Adding Key-Value pairs (Put)
        bogieCapacity.put("Sleeper (S1)", 72);
        bogieCapacity.put("AC Chair Car (C1)", 56);
        bogieCapacity.put("First Class (H1)", 24);

        // 2. Retrieving data (Get)
        String searchBogie = "AC Chair Car (C1)";
        Integer capacity = bogieCapacity.get(searchBogie);

        System.out.println("Capacity Analysis for: " + searchBogie);
        System.out.println("Seating Capacity : " + capacity);

        // 3. Display all mappings
        System.out.println("\nFull Bogie-Capacity Mapping:");
        System.out.println(bogieCapacity);

        System.out.println("\nUC8 capacity mapping completed...");
    }
}