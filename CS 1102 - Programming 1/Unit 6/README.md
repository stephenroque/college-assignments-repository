# **Vehicle Information System**

## **Overview**

The **Vehicle Information System** is a Java-based application that allows users to manage different types of vehicles such as **Cars**, **Motorcycles**, and **Trucks**. It offers an interactive command-line interface for users to add, display, and manage vehicle information including make, model, year, and other specific attributes for each vehicle type.

### **Features:**
- Add vehicles such as cars, motorcycles, and trucks to the system.
- Display all registered vehicles with detailed information.
- Store and manage vehicle-specific details like the number of doors (for cars), number of wheels (for motorcycles), cargo capacity (for trucks), and more.
- The system supports an extensible design with interfaces for common vehicle attributes and specific vehicle types.

---

## **Project Structure**

The project consists of the following main classes and interfaces:

1. **`Vehicle.java`**: The common interface for all vehicles, defining essential methods.
2. **`Car.java`**: Represents a car, implementing the `Vehicle` and `CarVehicle` interfaces.
3. **`Motorcycle.java`**: Represents a motorcycle, implementing the `Vehicle` and `MotorVehicle` interfaces.
4. **`Truck.java`**: Represents a truck, implementing the `Vehicle` and `TruckVehicle` interfaces.
5. **`CarVehicle.java`**: Interface defining additional methods for cars.
6. **`MotorVehicle.java`**: Interface defining additional methods for motorcycles.
7. **`TruckVehicle.java`**: Interface defining additional methods for trucks.
8. **`MainProgram.java`**: The main program class with a command-line interface for interacting with the system.

---

## **Class and Interface Descriptions**

### **Vehicle Interface**
- **Purpose**: Defines common properties and methods for all vehicle types.
- **Key Methods**:
  - `String getMake()`: Returns the make of the vehicle.
  - `String getModel()`: Returns the model of the vehicle.
  - `int getYear()`: Returns the manufacturing year of the vehicle.

### **CarVehicle Interface**
- **Purpose**: Defines additional methods specific to cars.
- **Key Methods**:
  - `void setNumberOfDoors(int doors)`: Sets the number of doors in the car.
  - `int getNumberOfDoors()`: Returns the number of doors in the car.
  - `void setFuelType(String fuelType)`: Sets the fuel type (Petrol, Diesel, Electric).
  - `String getFuelType()`: Returns the fuel type of the car.

### **MotorVehicle Interface**
- **Purpose**: Defines additional methods specific to motorcycles.
- **Key Methods**:
  - `void setNumberOfWheels(int wheels)`: Sets the number of wheels on the motorcycle.
  - `int getNumberOfWheels()`: Returns the number of wheels on the motorcycle.
  - `void setMotorcycleType(String type)`: Sets the type of motorcycle (Sport, Cruiser, Off-road).
  - `String getMotorcycleType()`: Returns the type of the motorcycle.

### **TruckVehicle Interface**
- **Purpose**: Defines additional methods specific to trucks.
- **Key Methods**:
  - `void setCargoCapacity(double capacity)`: Sets the cargo capacity of the truck (in tons).
  - `double getCargoCapacity()`: Returns the cargo capacity of the truck.
  - `void setTransmissionType(String type)`: Sets the transmission type (Manual, Automatic).
  - `String getTransmissionType()`: Returns the transmission type of the truck.

### **Car Class**
- **Purpose**: Represents a car and implements the `Vehicle` and `CarVehicle` interfaces.
- **Key Fields**:
  - `make`: The make of the car.
  - `model`: The model of the car.
  - `year`: The year of manufacture.
  - `numberOfDoors`: The number of doors in the car.
  - `fuelType`: The fuel type of the car.
- **Key Methods**:
  - `toString()`: Returns a string representation of the car.

### **Motorcycle Class**
- **Purpose**: Represents a motorcycle and implements the `Vehicle` and `MotorVehicle` interfaces.
- **Key Fields**:
  - `make`: The make of the motorcycle.
  - `model`: The model of the motorcycle.
  - `year`: The year of manufacture.
  - `numberOfWheels`: The number of wheels on the motorcycle.
  - `motorcycleType`: The type of motorcycle (Sport, Cruiser, Off-road).
- **Key Methods**:
  - `toString()`: Returns a string representation of the motorcycle.

### **Truck Class**
- **Purpose**: Represents a truck and implements the `Vehicle` and `TruckVehicle` interfaces.
- **Key Fields**:
  - `make`: The make of the truck.
  - `model`: The model of the truck.
  - `year`: The year of manufacture.
  - `cargoCapacity`: The cargo capacity of the truck (in tons).
  - `transmissionType`: The transmission type of the truck (Manual, Automatic).
- **Key Methods**:
  - `toString()`: Returns a string representation of the truck.

### **MainProgram Class**
- **Purpose**: The main class that runs the command-line interface for interacting with the vehicle system.
- **Key Methods**:
  - Provides an interactive menu to add vehicles (Cars, Motorcycles, Trucks).
  - Allows users to view all registered vehicles.
  - Handles user input and instantiates the appropriate vehicle classes based on user selection.

---

## **How to Run**

### Prerequisites
- JDK 8 or higher.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 6/Vehicle\ Information\ System\ for\ a\ Car\ Rental\ Agency/src/
   ```

### **Setup**
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the `MainProgram` class:
   ```bash
   java MainProgram
   ```

### **Running the Program**
When the program starts, it displays a menu with the following options:
1. **Add a Car**: Enter details for a new car (make, model, year, number of doors, fuel type).
2. **Add a Motorcycle**: Enter details for a new motorcycle (make, model, year, number of wheels, motorcycle type).
3. **Add a Truck**: Enter details for a new truck (make, model, year, cargo capacity, transmission type).
4. **Show All Vehicles**: Displays a list of all registered vehicles with their details.
5. **Exit**: Exits the program.

### **Example Usage**
1. **Add a Car**:
   - Make: `Toyota`
   - Model: `Camry`
   - Year: `2020`
   - Number of Doors: `4`
   - Fuel Type: `Petrol`

2. **Add a Motorcycle**:
   - Make: `Yamaha`
   - Model: `YZF-R1`
   - Year: `2022`
   - Number of Wheels: `2`
   - Type: `Sport`

3. **Add a Truck**:
   - Make: `Ford`
   - Model: `F-150`
   - Year: `2018`
   - Cargo Capacity: `2.5 tons`
   - Transmission: `Automatic`

---

## **Design Details**

### **Data Structure**
- **Vehicle Objects**: Stored in a `List<Vehicle>`, where each vehicle can be a `Car`, `Motorcycle`, or `Truck`.

### **Error Handling**
- **Input Validation**: Ensures that user input is valid (e.g., valid years, positive numbers for capacities).
  
---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**