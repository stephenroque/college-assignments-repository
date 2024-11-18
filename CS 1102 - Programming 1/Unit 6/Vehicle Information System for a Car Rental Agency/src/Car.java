/**
 * Car class that implements Vehicle and CarVehicle interfaces.
 * Represents a car with specific attributes.
 */
public class Car implements Vehicle, CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private String fuelType;

    /**
     * Constructor to initialize a Car object.
     *
     * @param make  the make of the car
     * @param model the model of the car
     * @param year  the year of manufacture
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car [Make=" + make + ", Model=" + model + ", Year=" + year + ", NumberOfDoors=" + numberOfDoors + ", FuelType=" + fuelType + "]";
    }
}
