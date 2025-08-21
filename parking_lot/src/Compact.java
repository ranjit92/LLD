public class Compact extends ParkingSpot{
    public Compact(int id) {
        super(id);
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if(isFree){
            System.out.println("Allocated compact slot " + id + "to "+ vehicle.getLicenseNo());
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
}
