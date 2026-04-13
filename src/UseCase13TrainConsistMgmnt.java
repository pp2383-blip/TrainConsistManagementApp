/**
 * =========================================================
 * MAIN CLASS - UseCase13TrainConsistMgmnt
 * =========================================================
 * * Use Case 13: Array-Based Consist Summary
 * * Description:
 * This class demonstrates the use of fixed-size arrays to
 * represent the final, static state of a train consist.
 * * At this stage, the application:
 * - Initializes a fixed-size array of bogies
 * - Iterates through the array to display bogie details
 * - Calculates a simple summary of the train
 * * This maps static data handling using Arrays.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC13 - Array-Based Consist Summary ");
        System.out.println("==============================================\n");

        // 1. Initialize a fixed-size String array
        // Arrays have a fixed length once created
        String[] finalConsist = {
                "Locomotive_L1",
                "Sleeper_S1",
                "AC_A1",
                "Pantry_P1",
                "Guard_G1"
        };

        // 2. Display the train summary using array iteration
        System.out.println("Final Train Consist Report:");
        System.out.println("---------------------------");

        for (int i = 0; i < finalConsist.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + finalConsist[i]);
        }

        // 3. Display final stats
        System.out.println("---------------------------");
        System.out.println("Total Bogies in Final Consist: " + finalConsist.length);

        System.out.println("\nUC13 static array summary completed...");
        System.out.println("Full Train Management Suite is now operational.");
    }
}