import java.util.ArrayList;
import java.util.Scanner;

public class MiniParkingLot {

    public static ArrayList<String> miniParkingslot(ArrayList<String> parkingLot) {

        Scanner input = new Scanner(System.in);

 
        for (int index = 0; index <= 20; index++) {
            parkingLot.add("Empty");
        }

        boolean running = true;

        while (running) {

            System.out.println("""
                Mini Parking System 
                
                1: Park your car 🚘
                2: Unpark your car 🚘
                3: Parking Status
                4: Exit
            """);

            System.out.print("Choose option: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter slot (0 - 20): ");
                    int slot = input.nextInt();

                    if (slot >= 0 && slot < parkingLot.size()) {

                        if (parkingLot.get(slot).equals("Empty")) {
                            parkingLot.set(slot, "Car");
                            System.out.println("✅ Parked at slot " + slot);
                        } else {
                            System.out.println("❌ Slot already occupied");
                        }

                    } else {
                        System.out.println("❌ Invalid slot");
                    }
                }

                case 2 -> {
                    System.out.print("Enter slot to unpark: ");
                    int slot = input.nextInt();

                    if (slot >= 0 && slot < parkingLot.size()) {

                        if (!parkingLot.get(slot).equals("Empty")) {
                            parkingLot.set(slot, "Empty");
                            System.out.println("✅ Car removed from slot " + slot);
                        } else {
                            System.out.println("❌ Slot already empty");
                        }

                    } else {
                        System.out.println("❌ Invalid slot");
                    }
                }

                case 3 -> {
                    for (int index = 0; index < parkingLot.size(); index++) {
                        System.out.println("Slot " + index + ": " + parkingLot.get(index));
                    }
                }

                case 4 -> {
                    running = false;
                    System.out.println("Exiting...");
                }

                default -> System.out.println("Invalid option");
            }
        }

        return parkingLot; 
    }

    public static void main(String[] args) {
        ArrayList<String> parkingLot = new ArrayList<>();
        miniParkingslot(parkingLot);
    }
}
