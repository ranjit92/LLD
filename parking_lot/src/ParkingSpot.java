public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle(){
        //Logic to remove vehicle
        return true;
    }
}
