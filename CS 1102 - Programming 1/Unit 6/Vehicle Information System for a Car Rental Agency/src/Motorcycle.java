/**
 * Motorcycle class that implements Vehicle and MotorVehicle interfaces.
 * Represents a motorcycle with specific attributes.
 */
public class Motorcycle implements Vehicle, MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfWheels;
    private String motorcycleType;

    /**
     * Constructor to initialize a Motorcycle object.
     *
     * @param make  the make of the motorcycle
     * @param model the model of the motorcycle
     * @param year  the year of manufacture
     */
    public Motorcycle(String make, String model, int year) {
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
    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    @Override
    public String toString() {
        return "Motorcycle [Make=" + make + ", Model=" + model + ", Year=" + year + ", NumberOfWheels=" + numberOfWheels + ", MotorcycleType=" + motorcycleType + "]";
    }
}
