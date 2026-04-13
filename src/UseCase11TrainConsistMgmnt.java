import java.util.PriorityQueue;
import java.util.Queue;

/**
 * =========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =========================================================
 * * Use Case 11: Priority-Based Train Departure
 * * Description:
 * This class simulates a priority-based departure system
 * using PriorityQueue to handle high-priority trains first.
 * * At this stage, the application:
 * - Adds trains with different priority levels
 * - Automatically sorts trains for departure
 * - Processes the highest priority train first
 * * This maps priority handling using PriorityQueue.
 * * @author Developer
 * @version 11.0
 */
public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC11 - Priority-Based Train Departure ");
        System.out.println("==============================================\n");

        // Create a PriorityQueue
        // Elements are ordered according to their natural ordering (Alphabetical)
        Queue<String> priorityDeparture = new PriorityQueue<>();

        // 1. Adding trains in random order
        priorityDeparture.add("Local_Train");
        priorityDeparture.add("Express_Train");
        priorityDeparture.add("Cargo_Train");
        priorityDeparture.add("Emergency_Train");

        System.out.println("Trains waiting in yard (Internal Order): " + priorityDeparture);

        // 2. Processing departures based on priority
        // In Alphabetical order: Cargo -> Emergency -> Express -> Local
        System.out.println("\n--- Processing Departures ---");

        while (!priorityDeparture.isEmpty()) {
            String train = priorityDeparture.poll();
            System.out.println("Departure: " + train + " has been cleared.");
        }

        System.out.println("\nUC11 priority-based operations completed...");
    }
}