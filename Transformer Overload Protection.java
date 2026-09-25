import java.util.Scanner;

public class TransformerOverloadProtection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Transformer Rated Current (A): ");
        double ratedCurrent = sc.nextDouble();

        System.out.print("Enter Measured Load Current (A): ");
        double loadCurrent = sc.nextDouble();

        System.out.println("\n--- Transformer Overload Protection ---");
        System.out.println("Rated Current  : " + ratedCurrent + " A");
        System.out.println("Load Current   : " + loadCurrent + " A");

        if (loadCurrent <= ratedCurrent) {

            System.out.println("Status: NORMAL");
            System.out.println("Protection: LOAD ON");

        } else if (loadCurrent <= ratedCurrent * 1.1) {

            System.out.println("Status: OVERLOAD WARNING");
            System.out.println("Protection: LOAD ON");
            System.out.println("Warning: Reduce the load!");

        } else {

            System.out.println("Status: CRITICAL OVERLOAD");
            System.out.println("Protection: LOAD OFF");
            System.out.println("Trip Relay: ACTIVATED");
        }

        sc.close();
    }
}
