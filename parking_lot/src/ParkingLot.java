import java.util.List;
import java.util.Map;

public class ParkingLot {
    private int id;
    private String name;
    private Address address;
    private ParkingRate parkingRate;

    private Map<String, Entrance> entrances;
    private Map<String, Exit> exits;
    private Map<String, ParkingSpot> spots;
    private Map<String, ParkingTicket> tickets;
    private List<DisplayBoard> boards;

    //Singleton implementation
    private static ParkingLot parkingLot = null;
    private ParkingLot(){

    }
    public static ParkingLot getParkingLot(){
        if(parkingLot == null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addEntrance(Entrance entrance){
        return false;
    }

    public boolean addExit(Exit exit){
        return false;
    }

    public boolean addParkingSpot(ParkingSpot spot){
        return false;
    }

    public boolean addDisplay(DisplayBoard board){
        return false;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle){
        return null;
    }

    public boolean isFull(ParkingSpot spotType){
        return false;
    }
}
