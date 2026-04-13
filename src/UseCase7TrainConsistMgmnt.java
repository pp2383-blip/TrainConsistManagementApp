import java.util.LinkedList;
import java.util.Queue;

/**
 * =========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * =========================================================
 * * Use Case 7: Train Departure Sequence (Queue)
 * * Description:
 * This class simulates a FIFO (First-In, First-Out) scenario
 * using a Queue for managing train departure sequences.
 * * At this stage, the application:
 * - Adds trains to the departure queue
 * - Processes the first train in line for departure
 * - Displays the remaining trains in the queue
 * * This maps FIFO behavior using Queue.
 * * @author Developer
 * @version 7.0
 */
public class UseCase7TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC7 - Train Departure Sequence (Queue) ");
        System.out.println("==============================================\n");

        // Create a Queue to manage departure sequence
        // LinkedList implements the Queue interface
        Queue<String> departureQueue = new LinkedList<>();

        // 1. Trains arriving at the platform (Enqueue)
        departureQueue.add("Express_101");
        departureQueue.add("Freight_202");
        departureQueue.add("Passenger_303");

        System.out.println("Current Departure Queue: " + departureQueue);

        // 2. Processing departure (Dequeue)
        // poll() removes the head of the queue (the first train added)
        if (!departureQueue.isEmpty()) {
            String departingTrain = departureQueue.poll();
            System.out.println("\nDeparture: " + departingTrain + " has left the station.");
        }

        // 3. Display the remaining queue
        System.out.println("\nUpdated Departure Queue: " + departureQueue);

        System.out.println("\nUC7 departure sequence completed...");
    }
}