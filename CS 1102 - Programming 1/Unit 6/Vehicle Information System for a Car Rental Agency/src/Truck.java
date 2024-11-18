/**
 * Truck class that implements Vehicle and TruckVehicle interfaces.
 * Represents a truck with specific attributes.
 */
public class Truck implements Vehicle, TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    /**
     * Constructor to initialize a Truck object.
     *
     * @param make  the make of the truck
     * @param model the model of the truck
     * @param year  the year of manufacture
     */
    public Truck(String make, String model, int year) {
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
    public void setCargoCapacity(double capacity) {
        this.cargoCapacity = capacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String type) {
        this.transmissionType = type;
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public String toString() {
        return "Truck [Make=" + make + ", Model=" + model + ", Year=" + year + ", CargoCapacity=" + cargoCapacity + " tons, TransmissionType=" + transmissionType + "]";
    }
}
