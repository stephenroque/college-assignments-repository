import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MainProgram class to run the Vehicle Information System.
 * Allows users to add and display vehicle details.
 */
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        
        while (true) {
            System.out.println("\nVehicle Information System");
            System.out.println("1. Add Car");
            System.out.println("2. Add Motorcycle");
            System.out.println("3. Add Truck");
            System.out.println("4. Show All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Create and add a Car object
                    System.out.print("Enter Car Make: ");
                    String carMake = scanner.nextLine();
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Car Year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Enter Number of Doors: ");
                    int carDoors = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
                    String carFuelType = scanner.nextLine();
                    
                    Car car = new Car(carMake, carModel, carYear);
                    car.setNumberOfDoors(carDoors);
                    car.setFuelType(carFuelType);
                    vehicles.add(car);
                    break;
                case 2:
                    // Create and add a Motorcycle object
                    System.out.print("Enter Motorcycle Make: ");
                    String motorcycleMake = scanner.nextLine();
                    System.out.print("Enter Motorcycle Model: ");
                    String motorcycleModel = scanner.nextLine();
                    System.out.print("Enter Motorcycle Year: ");
                    int motorcycleYear = scanner.nextInt();
                    System.out.print("Enter Number of Wheels: ");
                    int motorcycleWheels = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Motorcycle Type (Sport/Cruiser/Off-Road): ");
                    String motorcycleType = scanner.nextLine();
                    
                    Motorcycle motorcycle = new Motorcycle(motorcycleMake, motorcycleModel, motorcycleYear);
                    motorcycle.setNumberOfWheels(motorcycleWheels);
                    motorcycle.setMotorcycleType(motorcycleType);
                    vehicles.add(motorcycle);
                    break;
                case 3:
                    // Create and add a Truck object
                    System.out.print("Enter Truck Make: ");
                    String truckMake = scanner.nextLine();
                    System.out.print("Enter Truck Model: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Enter Truck Year: ");
                    int truckYear = scanner.nextInt();
                    System.out.print("Enter Cargo Capacity (tons): ");
                    double truckCapacity = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Transmission Type (Manual/Automatic): ");
                    String truckTransmission = scanner.nextLine();
                    
                    Truck truck = new Truck(truckMake, truckModel, truckYear);
                    truck.setCargoCapacity(truckCapacity);
                    truck.setTransmissionType(truckTransmission);
                    vehicles.add(truck);
                    break;
                case 4:
                    // Display all vehicles
                    System.out.println("\nRegistered Vehicles:");
                    for (Vehicle vehicle : vehicles) {
                        System.out.println(vehicle);
                    }
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
