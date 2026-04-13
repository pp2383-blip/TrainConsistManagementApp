import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * =========================================================
 * * Use Case 6: Emergency Bogie Removal (Stack)
 * * Description:
 * This class simulates a LIFO (Last-In, First-Out) scenario
 * using a Stack structure for emergency bogie handling.
 * * At this stage, the application:
 * - Pushes bogies onto the maintenance stack
 * - Pops the most recently added bogie first
 * - Displays the stack status after removal
 * * This maps LIFO behavior using Deque/Stack.
 * * @author Developer
 * @version 6.0
 */
public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC6 - Emergency Bogie Removal (Stack) ");
        System.out.println("==============================================\n");

        // Using ArrayDeque as a Stack (LIFO)
        Deque<String> maintenanceStack = new ArrayDeque<>();

        // 1. Adding (Pushing) bogies to the maintenance siding
        // The last one pushed stays at the "top"
        maintenanceStack.push("Bogie_A");
        maintenanceStack.push("Bogie_B");
        maintenanceStack.push("Bogie_C");

        System.out.println("Current Maintenance Stack: " + maintenanceStack);

        // 2. Emergency Removal (Pop)
        // This removes the "Top" element (the last one added)
        if (!maintenanceStack.isEmpty()) {
            String removedBogie = maintenanceStack.pop();
            System.out.println("\nEmergency: Removing " + removedBogie + " from the siding...");
        }

        // 3. Display the final state
        System.out.println("\nUpdated Maintenance Stack: " + maintenanceStack);

        System.out.println("\nUC6 emergency removal operations completed...");
    }
}