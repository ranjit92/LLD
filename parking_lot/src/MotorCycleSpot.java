public class MotorCycleSpot extends ParkingSpot{
    public MotorCycleSpot(int id) {
        super(id);
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if(isFree){
            System.out.println("Allocated Motor cycle slot " + id + "to "+ vehicle.getLicenseNo());
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
}
