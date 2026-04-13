import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * =========================================================
 * * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 * * This maps CRUD operations using ArrayList.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train
        passengerBogies.add("Sleeper (S1)");
        passengerBogies.add("AC Chair Car (C1)");
        passengerBogies.add("First Class (H1)");

        System.out.println("Bogies added: " + passengerBogies);
        System.out.println("Current Bogie Count: " + passengerBogies.size());

        // ---- READ (Check existence) ----
        // contains() checks if a specific bogie is in the list
        String searchBogie = "AC Chair Car (C1)";
        if (passengerBogies.contains(searchBogie)) {
            System.out.println("\nInspection: " + searchBogie + " is present in the consist.");
        }

        // ---- DELETE (Remove bogie) ----
        // remove() detaches a bogie from the list
        System.out.println("\nRemoving Sleeper (S1) for maintenance...");
        passengerBogies.remove("Sleeper (S1)");

        // ---- FINAL DISPLAY ----
        System.out.println("Updated Train Consist: " + passengerBogies);
        System.out.println("Final Bogie Count: " + passengerBogies.size());

        System.out.println("\nSystem ready for next operations...");
    }
}