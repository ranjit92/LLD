public class Large extends ParkingSpot{
    public Large(int id) {
        super(id);
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if(isFree){
            System.out.println("Allocated large cycle slot " + id + "to "+ vehicle.getLicenseNo());
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
}
