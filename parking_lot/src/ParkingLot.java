import java.util.*;

public class ParkingLot {
    private int id;
    private String name;
    private Address address;
    public ParkingRate parkingRate = new ParkingRate();

    private Map<Integer, ParkingSpot> spots = new LinkedHashMap<>();
    private Map<Integer, ParkingTicket> tickets = new HashMap<>();
    private List<DisplayBoard> boards = new ArrayList<>();

    //Singleton implementation
    private static ParkingLot parkingLot = null;

    private ParkingLot() {

    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void addParkingSpot(ParkingSpot spot) {
        spots.put(spot.getId(), spot);
    }

    public ParkingSpot getParkingSpot(int id) {
        return spots.get(id);
    }

    public void addDisplay(DisplayBoard board) {
        boards.add(board);
    }

    public void freeSlot(int id) {
        ParkingSpot spot = spots.get(id);
        if (spot != null) {
            spot.removeVehicle();
        }
    }

    public Collection<ParkingSpot> getAllSports() {
        return spots.values();
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        for (ParkingSpot s : spots.values()) {
            if (s.isFree && canfit(vehicle, s)) {
                s.assignVehicle(vehicle);
                ParkingTicket ticket = new ParkingTicket(s.getId(), vehicle);
                tickets.put(ticket.getTicketNo(), ticket);
                return ticket;
            }
        }
        return null;
    }

    private boolean canfit(Vehicle vehicle, ParkingSpot s) {
        if ((vehicle instanceof MotorCycle && s instanceof MotorCycleSpot)) {
            return true;
        } else if ((vehicle instanceof Van || vehicle instanceof Truck) && s instanceof Large) {
            return true;
        } else if (vehicle instanceof Car && s instanceof Handicapped) {
            return true;
        } else if (vehicle instanceof Car && s instanceof Compact) {
            return true;
        }
        return false;
    }
}
