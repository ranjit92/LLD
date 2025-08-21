public class Handicapped extends ParkingSpot{
    public Handicapped(int id) {
        super(id);
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if(isFree){
            System.out.println("Allocated handicapped slot " + id + "to "+ vehicle.getLicenseNo());
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
}
