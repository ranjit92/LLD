public class Admin extends Account{

    public boolean addParkingSpot(ParkingSpot parkingSpot){
        return false;
    }

    public boolean removeParkingSpot(ParkingSpot parkingSpot){
        return false;
    }

    public boolean addDisplayBoard(DisplayBoard board){
        return false;
    }

    public boolean addEntrance(Entrance entrance){
        return false;
    }

    public boolean addExit(Exit exit){
        return false;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}
