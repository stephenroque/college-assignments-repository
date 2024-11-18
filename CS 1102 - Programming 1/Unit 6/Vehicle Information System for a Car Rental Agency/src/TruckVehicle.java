/**
 * TruckVehicle interface that defines additional methods specific to trucks.
 */
public interface TruckVehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmissionType(String type);
    String getTransmissionType();
}
