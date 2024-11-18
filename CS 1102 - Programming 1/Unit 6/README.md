**Project Documentation**

**Overview**

The Vehicle Information System is a Java application designed for a car
rental agency to manage different types of vehicles, including cars,
motorcycles, and trucks. The system uses interfaces to define common
behaviors and enforce consistency across various vehicle types.

**Classes and Interfaces**

**Interfaces**

1. **Vehicle**

-   Defines common properties and methods for all vehicles.

-  **Methods:**

    -   String getMake(): Returns the make of the vehicle.

    -   String getModel(): Returns the model of the vehicle.

    -   int getYear(): Returns the year of manufacture of the vehicle.

2. **CarVehicle**

-   Extends the Vehicle interface with additional properties specific to
    cars.

-  **Methods**:

    -   void setNumberOfDoors(int doors): Sets the number of doors for
        the car.

    -   int getNumberOfDoors(): Returns the number of doors of the car.

    -   void setFuelType(String fuelType): Sets the fuel type of the car
        (Petrol/Diesel/Electric).

    -   String getFuelType(): Returns the fuel type of the car.

3. **MotorVehicle**

-   Extends the Vehicle interface with additional properties specific to
    motorcycles.

-  **Methods:**

    -   void setNumberOfWheels(int wheels): Sets the number of wheels
        for the motorcycle.

    -   int getNumberOfWheels(): Returns the number of wheels of the
        motorcycle.

    -   void setMotorcycleType(String type): Sets the type of the
        motorcycle (Sport/Cruiser/Off-Road).

    -   String getMotorcycleType(): Returns the type of the motorcycle.

4. **TruckVehicle**

-   Extends the Vehicle interface with additional properties specific to
    trucks.

-  **Methods:**

    -   void setCargoCapacity(double capacity): Sets the cargo capacity
        of the truck (in tons).

    -   double getCargoCapacity(): Returns the cargo capacity of the
        truck.

    -   void setTransmissionType(String type): Sets the transmission
        type of the truck (Manual/Automatic).

    -   String getTransmissionType(): Returns the transmission type of
        the truck.

**Classes**

1. **Car**

-   Implements Vehicle and CarVehicle interfaces.

-   Represents a car with attributes for make, model, year, number of
    doors, and fuel type.

-  **Constructor:**

    -   Car(String make, String model, int year): Initializes a Car
        object with the specified make, model, and year.

```{=html}
<!-- -->
```
-  **Methods:**

    -   getMake(), getModel(), getYear(), setNumberOfDoors(int doors),
        getNumberOfDoors(), setFuelType(String fuelType), getFuelType()

-  **toString()**: Returns a string representation of the car details.

2. **Motorcycle**

-   Implements Vehicle and MotorVehicle interfaces.

-   Represents a motorcycle with attributes for make, model, year,
    number of wheels, and type.

-  **Constructor:**

    -   Motorcycle(String make, String model, int year): Initializes a
        Motorcycle object with the specified make, model, and year.

-  **Methods:**

    -   getMake(), getModel(), getYear(), setNumberOfWheels(int wheels),
        getNumberOfWheels(), setMotorcycleType(String type),
        getMotorcycleType()

-  **toString()**: Returns a string representation of the motorcycle
    details.

3. **Truck**

-   Implements Vehicle and TruckVehicle interfaces.

-   Represents a truck with attributes for make, model, year, cargo
    capacity, and transmission type.

-  **Constructor:**

    -   Truck(String make, String model, int year): Initializes a Truck
        object with the specified make, model, and year.

-  **Methods:**

    -   getMake(), getModel(), getYear(), setCargoCapacity(double
        capacity), getCargoCapacity(), setTransmissionType(String type),
        getTransmissionType()

-  **toString()**: Returns a string representation of the truck
    details.

**Main Program**

**MainProgram Class**

The MainProgram class contains the main method to run the Vehicle
Information System. It allows users to add vehicles and display their
details interactively.

**Variables:**

-   Scanner scanner: Used for reading user input.

-   List\<Vehicle\> vehicles: Stores the list of all registered
    vehicles.

**Methods:**

-   public static void main(String\[\] args): The main method that
    drives the program. It displays a menu to the user, accepts inputs
    to add vehicles, and displays the details of registered vehicles.

**Functionality:**

1.  Display a menu with options:

-   Add Car

-   Add Motorcycle

-   Add Truck

-   Show All Vehicles

-   Exit

2.  Based on user selection, prompt for the relevant vehicle details and
    create the corresponding vehicle object.

3.  Store the vehicle object in a list.

4.  Display all registered vehicles when the user selects the option to
    show all vehicles.

**Instructions for Running the Program**

-   The program will display a menu with options to add cars,
    motorcycles, or trucks, display all registered vehicles, or exit the
    program.

-   Follow the prompts to input details for each vehicle type.

-   Use the \"Show All Vehicles\" option to display the details of all
    registered vehicles.

-   To exit the program, select the \"Exit\" option.
