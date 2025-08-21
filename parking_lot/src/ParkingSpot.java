public abstract class ParkingSpot {
    public int id;
    public boolean isFree = true;
    public Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        if (!isFree && vehicle != null) {
            System.out.println("Slot " + id + " freed was " + vehicle.getLicenseNo());
            vehicle = null;
            isFree = true;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
